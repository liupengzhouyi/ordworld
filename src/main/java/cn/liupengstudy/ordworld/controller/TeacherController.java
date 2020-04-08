package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Teacher;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LpPassword;
import cn.liupengstudy.ordworld.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @ApiOperation(value = "添加教师信息")
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



}