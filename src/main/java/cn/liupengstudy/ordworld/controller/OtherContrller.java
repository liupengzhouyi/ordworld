package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.*;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.MyTitleInformation;
import cn.liupengstudy.ordworld.entity.tools.SelectTitleInformation;
import cn.liupengstudy.ordworld.entity.tools.StudentGetApplicationInformation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.ordworld.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/20 - 12:16 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/OtherContrller")
@Api(tags = "其他控制器")
public class OtherContrller {

    @Autowired
    private SelecttitleController selecttitleController;

    @Autowired
    private ProjectController projectController;

    @Autowired
    private StudentController studentController;

    @Autowired
    private TeacherController teacherController;

    @Autowired
    private GroupnumberController groupnumberController;

    @Autowired
    private GroupController groupController;


    @ApiOperation(value = "通过选题ID查询选题申请信息")
    @RequestMapping(path = "/selectApplicationTitleInformationByTitle", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByNumber(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询选题申请信息");
        boolean key = true;
        LPR selectTitleLpr = this.selecttitleController.getAllByTitle(selecttitle);
        if (selectTitleLpr.isReturnKey()) {
            lpr.setWhy("获取数据");
            List<Selecttitle> list = (List<Selecttitle>) selectTitleLpr.getReturnObject();
            List<SelectTitleInformation> returnList = new ArrayList<SelectTitleInformation>();
            for (Selecttitle temp : list) {
                SelectTitleInformation selectTitleInformation = new SelectTitleInformation();
                // SelectTitle
                selectTitleInformation.setSelecttitle(temp);
                // Project
                Project project = new Project();
                project.setId(temp.getTitleid());
                LPR projectLpr = this.projectController.selectOne(project);
                if (projectLpr.isReturnKey()) {
                    selectTitleInformation.setProject((Project) projectLpr.getReturnObject());
                }
                // Student
                Student student = new Student();
                student.setId(temp.getStudentid());
                LPR studentLpr = this.studentController.selectOne(student);
                if (studentLpr.isReturnKey()) {
                    selectTitleInformation.setStudent((Student) studentLpr.getReturnObject());
                }
                returnList.add(selectTitleInformation);
            }
            lpr.setReturnObject(returnList);
        } else {
            key = false;
            lpr.setWhy("没有获取数据");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生查看自己的申请信息")
    @RequestMapping(path = "/selectStudentApplication", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectStudentApplication(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生查看自己的申请信息");
        boolean key = true;
        // student number to student id
        LPR getStudentIdLpr = this.studentController.selectByStudentID(student);
        if (getStudentIdLpr.isReturnKey()) {
            Student student1 = (Student) getStudentIdLpr.getReturnObject();
            Integer studentid = student1.getId();
            Selecttitle selecttitle = new Selecttitle();
            selecttitle.setStudentid(studentid);
            // get all select title information
            LPR getAllByStudentLpr = this.selecttitleController.getAllByStudent(selecttitle);
            if (getAllByStudentLpr.isReturnKey()) {
                List<StudentGetApplicationInformation> returnList = new ArrayList<>();
                List<Selecttitle> list = (List<Selecttitle>) getAllByStudentLpr.getReturnObject();
                for (Selecttitle temp : list) {
                    StudentGetApplicationInformation studentGetApplicationInformation = new StudentGetApplicationInformation();
                    // get project information
                    Project project = new Project();
                    project.setId(temp.getTitleid());
                    LPR getProjectLpr = this.projectController.selectOne(project);
                    Project tempProject = null;
                    if (getProjectLpr.isReturnKey()) {
                        tempProject = (Project) getProjectLpr.getReturnObject();
                    }
                    // get teacher information
                    Teacher teacher = new Teacher();
                    teacher.setTeachernumber(tempProject.getTeacherid().toString());
                    // System.out.println(teacher.toString());
                    LPR getTeacherLpr = this.teacherController.selectByNumber(teacher);
                    Teacher tempTeacher = null;
                    if (getTeacherLpr.isReturnKey()) {
                        tempTeacher = (Teacher) getTeacherLpr.getReturnObject();
                        System.out.println(tempTeacher.toString());
                    }
                    // set studentGetApplicationInformation
                    studentGetApplicationInformation.setSelecttitle(temp);
                    studentGetApplicationInformation.setProject(tempProject);
                    studentGetApplicationInformation.setTeacher(tempTeacher);
                    returnList.add(studentGetApplicationInformation);
                }
                lpr.setReturnObject(returnList);
            } else {
                key = false;
                lpr.setWhy("没有数据");
            }
        } else {
            key = false;
            lpr.setWhy("没有该学生");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生查看自己的毕业设计信息")
    @RequestMapping(path = "/selectMyTitle", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectMyTitle(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生查看自己的毕业设计信息");
        boolean key = true;
        MyTitleInformation myTitleInformation = new MyTitleInformation();
        Integer titleId = -1;
        String teacherNumber = "";
        Integer studnetId = -1;
        // 学生信息
        LPR studentLpr = this.studentController.selectByStudentID(student);
        if (studentLpr.isReturnKey()) {
            Student studentTemp = (Student) studentLpr.getReturnObject();
            myTitleInformation.setStudent(studentTemp);
            studnetId = studentTemp.getId();
        } else {
            key = false;
            lpr.setWhy("没有学生数据");
        }
        // 选题信息
        Selecttitle selecttitle = new Selecttitle();
        selecttitle.setStudentid(studnetId);
        LPR selectTitleLpr = this.selecttitleController.getAllByStudent(selecttitle);
        if (selectTitleLpr.isReturnKey()) {
            List<Selecttitle> list1 = (List<Selecttitle>) selectTitleLpr.getReturnObject();
            for (Selecttitle temp: list1) {
                if (temp.getPass() - 1 == 0) {
                    myTitleInformation.setSelecttitle(temp);
                    lpr.setWhy("有通过申请数据");
                    titleId = temp.getTitleid();
                    break;
                }
            }
        } else {
            key = false;
            lpr.setWhy("没有申请数据");
        }
        // 题目信息
        Project project = new Project();
        project.setId(titleId);
        LPR projectLpr = this.projectController.selectOne(project);
        if (projectLpr.isReturnKey()) {
            Project projectTemp = (Project) projectLpr.getReturnObject();
            myTitleInformation.setProject(projectTemp);
            teacherNumber = projectTemp.getTeacherid() + "";
        } else {
            key = false;
            lpr.setWhy("没有选题数据");
        }
        // 教师信息
        Teacher teacher = new Teacher();
        teacher.setTeachernumber(teacherNumber);
        LPR teacherLpr = this.teacherController.selectByNumber(teacher);
        if (teacherLpr.isReturnKey()) {
            Teacher teacherTemp = (Teacher) teacherLpr.getReturnObject();
            myTitleInformation.setTeacher(teacherTemp);
        } else {
            key = false;
            lpr.setWhy("没有教师数据");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(myTitleInformation);
        return lpr;
    }


    @ApiOperation(value = "学生获取讨论组")
    @RequestMapping(path = "/studentGetMyGroup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR studentGetMyGroup(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生获取讨论组");
        boolean key = true;
        LPR getDBIndex = this.groupnumberController.studentNumberToID(student);
        if (getDBIndex.isReturnKey()) {
            Groupnumber groupnumber = new Groupnumber();
            Student temp = (Student) getDBIndex.getReturnObject();
            groupnumber.setStudentid(temp.getId());
            LPR getGroupListLpr = this.groupnumberController.getAllGroup(groupnumber);
            if (getGroupListLpr.isReturnKey()) {
                List<Groupnumber> list = (List<Groupnumber>) getGroupListLpr.getReturnObject();
                List<Group> returnList = new ArrayList<>();
                for ( Groupnumber item :list) {
                    Group group = new Group();
                    group.setId(item.getGroupid());
                    LPR getGroupLpr = this.groupController.selectOne(group);
                    if (getGroupLpr.isReturnKey()) {
                        Group tempGroup = (Group) getGroupLpr.getReturnObject();
                        returnList.add(tempGroup);
                    }
                }
                lpr.setReturnObject(returnList);
            } else {
                key = false;
                lpr.setWhy("没有讨论组");
            }
        } else {
            key = false;
            lpr.setWhy("没有该学生");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

}
