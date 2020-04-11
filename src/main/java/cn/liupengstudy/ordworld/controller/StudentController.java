package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过学ID查询学生")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Student selectOne(Integer id) {
        return this.studentService.queryById(id);
    }

    @ApiOperation(value = "学生注册")
    @RequestMapping(path = "/addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR addOne(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生注册");
        boolean key = true;
        Student student1 = this.studentService.insert(student);
        if (student1 == null) {
            key = false;
            lpr.setWhy("注册失败");
        } else {
            lpr.setWhy("注册成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(student1);
        return lpr;
    }








}