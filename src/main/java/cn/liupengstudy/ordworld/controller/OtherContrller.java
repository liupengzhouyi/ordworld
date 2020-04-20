package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.tools.LPR;
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
                    studentGetApplicationInformation.setSelecttitle(temp);
                    Project project = new Project();
                    project.setId(temp.getTitleid());
                    LPR getProjectLpr = this.projectController.selectOne(project);
                    Project tempProject = (Project) getProjectLpr.getReturnObject();
                    studentGetApplicationInformation.setProject(tempProject);
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


}
