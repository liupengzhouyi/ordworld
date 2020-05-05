package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Conservator;
import cn.liupengstudy.ordworld.entity.Groupnumber;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.GroupnumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Groupnumber)表控制层
 *
 * @author makejava
 * @since 2020-04-12 23:09:29
 */
@RestController
@RequestMapping("/groupnumber")
@Api(tags = "讨论组成员控制器")
@SuppressWarnings("unchecked")
public class GroupnumberController {
    /**
     * 服务对象
     */
    @Resource
    private GroupnumberService groupnumberService;

    @Autowired
    private StudentController studentController;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过ID查询")
    @RequestMapping(path = "/selectByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByID(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询");
        boolean key = true;
        Groupnumber groupnumber1 = this.groupnumberService.queryById(groupnumber.getId());
        if (groupnumber1 == null) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(groupnumber1);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组添加成员")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("讨论组添加成员");
        boolean key = true;
        Student temp = new Student();
        temp.setStudentid(groupnumber.getStudentid().toString());
        LPR studnetNumberToIDLpr = this.studentNumberToID(temp);
        if (studnetNumberToIDLpr.isReturnKey()) {
            temp = (Student) studnetNumberToIDLpr.getReturnObject();
            groupnumber.setStudentid(temp.getId());
            Groupnumber groupnumber1 = this.groupnumberService.insert(groupnumber);
            if (groupnumber1 == null) {
                lpr.setWhy("添加失败");
                key = false;
            } else {
                lpr.setWhy("添加成功");
                lpr.setReturnObject(groupnumber1);
            }
        } else {
            lpr.setWhy("没有该学生");
            key = false;
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组删除成员")
    @RequestMapping(path = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR delete(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("讨论组删除成员");
        boolean key = this.groupnumberService.deleteById(groupnumber.getId());
        if (key) {
            lpr.setWhy("删除失败");
        } else {
            lpr.setWhy("删除成功");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组获取成员")
    @RequestMapping(path = "/getAllNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllNumber(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询");
        boolean key = true;
        List<Groupnumber> list = this.groupnumberService.getAllNumber(groupnumber);
        List<Student> studentList = new ArrayList<Student>();
        for (Groupnumber temp : list) {
            Student student = new Student();
            student.setId(temp.getStudentid());
            LPR studentLpr = this.studentController.selectOne(student);
            if (studentLpr.isReturnKey()) {
                Student newStudent = (Student) studentLpr.getReturnObject();
                studentList.add(newStudent);
            }
        }
        if (list.size() <= 0) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(studentList);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "成员获取讨论组")
    @RequestMapping(path = "/getAllGroup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllGroup(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询");
        boolean key = true;
        List<Groupnumber> list = this.groupnumberService.getAllGroup(groupnumber);
        if (list.size() <= 0) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(list);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生数据库编号转学号")
    @RequestMapping(path = "/studentIdToNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR studentIdToNumber(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生数据库编号转学号");
        boolean key = true;
        LPR studentIdToNumberLpr = this.studentController.selectOne(student);
        if (studentIdToNumberLpr.isReturnKey()) {
            lpr.setWhy("查询成功");
            Student temp = (Student) studentIdToNumberLpr.getReturnObject();
            lpr.setReturnObject(temp);
        } else {
            lpr.setWhy("查询失败");
            key = false;
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生学号转数据库编号")
    @RequestMapping(path = "/studentNumberToID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR studentNumberToID(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生学号转数据库编号");
        boolean key = true;
        LPR studentIdToNumberLpr = this.studentController.selectByStudentID(student);
        if (studentIdToNumberLpr.isReturnKey()) {
            lpr.setWhy("查询成功");
            Student temp = (Student) studentIdToNumberLpr.getReturnObject();
            lpr.setReturnObject(temp);
        } else {
            lpr.setWhy("查询失败");
            key = false;
        }
        lpr.setReturnKey(key);
        return lpr;
    }





}