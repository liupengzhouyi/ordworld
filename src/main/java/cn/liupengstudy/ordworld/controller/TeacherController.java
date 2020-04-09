package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Teacher;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LpPassword;
import cn.liupengstudy.ordworld.entity.tools.ReTeacher;
import cn.liupengstudy.ordworld.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 教师(Teacher)表控制层
 *
 * @author makejava
 * @since 2020-04-08 23:38:18
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {

    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody Teacher teacher) {
        LPR lpr = new LPR();
        lpr.setWhat("教师通过主键查询单条数据");
        boolean key = true;
        Teacher teacher1 = this.teacherService.queryById(teacher.getId());
        if (teacher1 != null) {
            lpr.setWhy("查询成功");
        } else {
            key = false;
            lpr.setWhy("查询失败");
        }
        lpr.setReturnObject(teacher1);
        return lpr;
    }

    @ApiOperation(value = "教师注册")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Teacher teacher) {
        LPR lpr = new LPR();
        lpr.setWhat("添加教师信息");
        boolean key = true;
        Teacher teacher1 = null;
        // find different
        LPR selectByNumberLpr = this.selectByNumber(teacher);
        if (selectByNumberLpr.isReturnKey()) {
            key = false;
            lpr.setWhy("教师编号重复");
        } else {
            // update password
            LpPassword lpPassword = new LpPassword(teacher.getTeachernumber(), teacher.getPassword()+"");
            teacher.setPassword(lpPassword.getPasswordValue());
            // add
            teacher1 = this.teacherService.insert(teacher);
            if (teacher1 == null) {
                key = false;
                lpr.setWhy("注册失败");
            } else {
                lpr.setWhy("注册成功");
            }
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(teacher1);
        return lpr;
    }

    @ApiOperation(value = "通过教师编号查询教师信息")
    @RequestMapping(path = "/selectByNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByNumber(@RequestBody Teacher teacher) {
        LPR lpr = new LPR();
        lpr.setWhat("通过教师编号查询教师信息");
        boolean key = true;
        Teacher teacher1 = this.teacherService.selectByNumber(teacher.getTeachernumber());
        if (teacher1 != null) {
            lpr.setWhy("查询到数据");
        } else {
            key = false;
            lpr.setWhy("没有查询到数据");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(teacher1);
        return lpr;
    }

    @ApiOperation(value = "教师登陆")
    @RequestMapping(path = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR landing(@RequestBody Teacher teacher) {
        LPR lpr = new LPR();
        lpr.setWhat("教师登陆");
        boolean key = true;
        LPR selectByNumberLpr = this.selectByNumber(teacher);
        Teacher temp = null;
        if (selectByNumberLpr.isReturnKey()) {
            temp = (Teacher) selectByNumberLpr.getReturnObject();
            LpPassword lpPassword = new LpPassword(teacher.getTeachernumber(), teacher.getPassword() + "");
            if (temp.getPassword() == lpPassword.getPasswordValue()) {
                lpr.setWhy("登陆成功");
            } else {
                key = false;
                lpr.setWhy("密码错误");
            }
        } else {
            key = false;
            lpr.setWhy("没有该账号");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(temp);
        return lpr;
    }

    @ApiOperation(value = "电话号码查重")
    @RequestMapping(path = "/findSamePhoneNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR findSamePhoneNumber(@RequestBody Teacher teacher) {
        LPR lpr = new LPR();
        lpr.setWhat("教师电话号码查重");
        boolean key = true;
        List<Teacher> list = this.teacherService.findByPhoneNimber(teacher.getPhonenumber());
        if (list.size() <= 0) {
            key = false;
            lpr.setWhat("没有该电话号码");
        } else {
            lpr.setWhat("该电话号码已注册");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "编辑信息")
    @RequestMapping(path = "/edit", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR edit(@RequestBody Teacher teacher) {
        LPR lpr = new LPR();
        lpr.setWhat("编辑信息");
        boolean key = true;
        Teacher teacher1 = null;
        // find different
        LPR selectByNumberLpr = this.selectByNumber(teacher);
        if (selectByNumberLpr.isReturnKey()) {
            key = false;
            lpr.setWhy("教师编号重复");
        } else {
            LPR phoneNumberLpr = this.findSamePhoneNumber(teacher);
            if (phoneNumberLpr.isReturnKey()) {
                key = false;
                lpr.setWhy(phoneNumberLpr.getWhy());
            } else {
                // add
                teacher1 = this.teacherService.update(teacher);
                if (teacher1 == null) {
                    key = false;
                    lpr.setWhy("编辑失败");
                } else {
                    lpr.setWhy("编辑成功");
                }
            }
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(teacher1);
        return lpr;
    }

    @ApiOperation(value = "修改密码")
    @RequestMapping(path = "/rePassword", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR rePassword(@RequestBody ReTeacher reTeacher) {
        LPR lpr = new LPR();
        lpr.setWhat("修改密码");
        boolean key = true;
        // 新密码去空格
        reTeacher.setPassword1(reTeacher.getPassword1().replace(" ", ""));
        reTeacher.setPassword2(reTeacher.getPassword2().replace(" ", ""));

        if (reTeacher.getPassword1().length() <= 0) {
            lpr.setWhy("新密码不能为空");
            key = false;
        } else {
            if (reTeacher.getPassword1().equals(reTeacher.getPassword2())) {
                LPR landingLpr = this.landing(reTeacher.getTeacher());
                if (landingLpr.isReturnKey()) {
                    Teacher temp = (Teacher) landingLpr.getReturnObject();
                    LpPassword lpPassword = new LpPassword(temp.getTeachernumber(), reTeacher.getPassword1());
                    temp.setPassword(lpPassword.getPasswordValue());
                    int k = this.teacherService.rePassword(temp.getId(), temp.getPassword());
                    if (k == 1) {
                        lpr.setWhy("修改成功");
                    } else {
                        lpr.setWhy("修改失败");
                        key = false;
                    }
                } else {
                    lpr.setWhy("原密码错误");
                    key = false;
                }
            } else {
                lpr.setWhy("俩个新密码不一致");
                key = false;
            }
        }

        lpr.setReturnKey(key);
        return lpr;
    }




}