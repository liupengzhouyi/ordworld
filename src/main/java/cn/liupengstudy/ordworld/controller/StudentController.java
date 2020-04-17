package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LpPassword;
import cn.liupengstudy.ordworld.entity.tools.ReStudent;
import cn.liupengstudy.ordworld.entity.tools.ReTeacher;
import cn.liupengstudy.ordworld.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生表(Student)表控制层
 *
 * @author makejava
 * @since 2020-04-11 22:14:01
 */
@RestController
@RequestMapping("/student")
@Api(tags = "学生控制器")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过学ID查询学生")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("通过学ID查询学生");
        boolean key = true;
        Student student1 = this.studentService.queryById(student.getId());
        if (student1 == null) {
            key = false;
            lpr.setWhy("查询失败");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(student1);
        return lpr;
    }

    @ApiOperation(value = "通过学号查询学生")
    @RequestMapping(path = "/selectByStudentID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByStudentID(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("通过学号查询学生");
        boolean key = true;
        Student student1 = this.studentService.queryByStudentNumber(student.getStudentid());
        if (student1 == null) {
            key = false;
            lpr.setWhy("查询失败");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(student1);
        return lpr;
    }

    @ApiOperation(value = "通过联系方式查询学生")
    @RequestMapping(path = "/selectByPhoneNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByPhoneNumber(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("通过联系方式查询学生");
        boolean key = true;
        Student student1 = this.studentService.queryByPhoneNumber(student.getPhonenumber());
        if (student1 == null) {
            key = false;
            lpr.setWhy("查询失败");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(student1);
        return lpr;
    }

    @ApiOperation(value = "学生注册")
    @RequestMapping(path = "/addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR addOne(@RequestBody ReStudent reStudent) {
        Student student = reStudent.getStudent();
        student.setPhonenumber(student.getPhonenumber().replace(" ", ""));
        student.setStudentid(student.getStudentid().replace(" ", ""));
        LPR lpr = new LPR();
        lpr.setWhat("学生注册");
        boolean key = true;
        LPR idLpr = this.selectByStudentID(student);
        if (idLpr.isReturnKey()) {
            key = false;
            lpr.setWhy("注册失败, 该学号已注册");
        } else {
            LPR phoneNumbwerLpr = this.selectByPhoneNumber(student);
            if (phoneNumbwerLpr.isReturnKey()) {
                key = false;
                lpr.setWhy("注册失败, 联系方式重复");
            } else {
                LpPassword lpPassword = new LpPassword(student.getStudentid(), reStudent.getPassword());
                student.setPassword(lpPassword.getPasswordValue());
                Student student1 = this.studentService.insert(student);
                if (student1 == null) {
                    key = false;
                    lpr.setWhy("注册失败");
                } else {
                    lpr.setWhy("注册成功");
                }
                lpr.setReturnObject(student1);
            }
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生登陆")
    @RequestMapping(path = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR landing(@RequestBody ReStudent reStudent) {
        LPR lpr = new LPR();
        lpr.setWhat("学生登陆");
        boolean key = true;
        LPR selectLpr = this.selectByStudentID(reStudent.getStudent());
        // System.out.println(selectLpr.toString());
        if (selectLpr.isReturnKey()) {
            // LpPassword lpPassword11 = new LpPassword(reStudent.getStudent().getStudentid(), reStudent.getPassword());
            // System.out.println(reStudent.getPassword() + ":" + lpPassword11.getPasswordValue());
            LpPassword lpPassword = new LpPassword(reStudent.getStudent().getStudentid(), reStudent.getPassword());
            Student temp = (Student) selectLpr.getReturnObject();
            // System.out.println(temp.toString());
            if (lpPassword.getPasswordValue() - temp.getPassword() == 0) {
                lpr.setWhy("登陆成功");
                lpr.setReturnObject(temp);
            } else {
                key = false;
                lpr.setWhy("密码错误");
            }
        } else {
            key = false;
            lpr.setWhy("账号错误");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生修改密码")
    @RequestMapping(path = "/rePassword", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR rePassword(@RequestBody ReStudent reStudent) {
        LPR lpr = new LPR();
        lpr.setWhat("学生修改密码");
        boolean key = true;
        LPR landingLpr = this.landing(reStudent);
        if (landingLpr.isReturnKey()) {
            Student temp = (Student) landingLpr.getReturnObject();
            LpPassword lpPassword = new LpPassword(temp.getStudentid(), reStudent.getPassword1());
            Student student = this.studentService.rePassword(temp.getId(), lpPassword.getPasswordValue());
            if (student == null) {
                key = false;
                lpr.setWhy("修改失败");
            } else {
                lpr.setWhy("修改失败");
            }
            lpr.setReturnObject(student);
        } else {
            key = false;
            lpr.setWhy("原密码错误");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生编辑信息")
    @RequestMapping(path = "/edit", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR edit(@RequestBody ReStudent reStudent) {
        LPR lpr = new LPR();
        lpr.setWhat("学生编辑信息");
        boolean key = true;
        Student student = this.studentService.update(reStudent.getStudent());
        if (student == null) {
            key = false;
            lpr.setWhy("编辑失败");
        } else {
            lpr.setWhy("编辑成功");
        }
        lpr.setReturnObject(student);
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "获取所有学生信息")
    @RequestMapping(path = "/getAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAll(){
        LPR lpr = new LPR();
        lpr.setWhat("获取所有学生信息");
        boolean key = true;
        List<Student> list = this.studentService.getAll();
        if (list.size() <= 0) {
            key = false;
            lpr.setWhy("没有信息");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnObject(list);
        lpr.setReturnKey(key);
        return lpr;

    }

}