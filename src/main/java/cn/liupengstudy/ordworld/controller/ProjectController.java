package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LpPassword;
import cn.liupengstudy.ordworld.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 毕设题目(Project)表控制层
 *
 * @author makejava
 * @since 2020-04-09 19:16:54
 */
@RestController
@RequestMapping("/project")
@Api(tags = "毕设题目控制器")
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过ID查找毕设题目信息")
    @RequestMapping("/selectOne")
    public LPR selectOne(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID毕设题目信息");
        boolean key = true;
        Project project1 = this.projectService.queryById(project.getId());
        if (project1 == null) {
            lpr.setWhy("没有数据，查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(project1);
        return lpr;
    }

    @ApiOperation(value = "添加毕设题目信息")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("添加毕设题目信息");
        boolean key = true;
        LPR findSameLpr = this.findSame(project);
        if (findSameLpr.isReturnKey()) {
            lpr.setWhy("添加失败," + findSameLpr.getWhy());
            key = false;
            lpr.setReturnObject(findSameLpr.getReturnObject());
        } else {
            project.setTitle(project.getTitle().replace(" ", ""));
            Project project1 = this.projectService.insert(project);
            if (project1 == null) {
                key = false;
                lpr.setWhy("添加失败");
            } else {
                lpr.setWhy("添加成功");
            }
            lpr.setReturnObject(project1);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "查询是否有重复毕设题目信息")
    @RequestMapping(path = "/findSame", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR findSame(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("查询是否有重复毕设题目信息");
        boolean key = true;
        project.setTitle(project.getTitle().replace(" ", ""));
        List<Project> list = this.projectService.findSame(project.getTeacherid(), project.getTitle());
        if (list.size() == 0) {
            key = false;
            lpr.setWhy("没有相同数据");
        } else {
            lpr.setWhy("有相同数据");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "删除毕设题目信息")
    @RequestMapping(path = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR delete(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("删除毕设题目信息");
        boolean key = true;
        LPR selectLpr = this.selectOne(project);
        if (selectLpr.isReturnKey()) {
            Project temp = (Project) selectLpr.getReturnObject();
            if (temp.getTeacherid() - project.getTeacherid() == 0) {
                boolean deleteKey = this.projectService.deleteById(project.getId());
                if (deleteKey) {
                    lpr.setWhy("删除成功");
                } else {
                    lpr.setWhy("删除失败");
                    key = false;
                }
                lpr.setReturnObject(temp);
            } else {
                key = false;
                lpr.setWhy("无权限删除指令");
            }
        } else {
            key = false;
            lpr.setWhy("没有数据，无法执行删除指令");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "查询某个老师的所有题目")
    @RequestMapping(path = "/getAllByTeacherId", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTeacherId(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("查询某个老师的所有题目");
        boolean key = true;
        List<Project> list = this.projectService.getAllByTeacherId(project.getTeacherid());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据，查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "查询某所有题目")
    @RequestMapping(path = "/getAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAll(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("查询所有题目");
        boolean key = true;
        List<Project> list = this.projectService.queryAllByConservator();
        if (list.size() <= 0) {
            lpr.setWhy("没有数据，查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "批准学生申请")
    @RequestMapping(path = "/tasksToStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR tasksToStudent(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("批准学生申请");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(project);
        if (selectOneLpr.isReturnKey()) {
            Project temp = (Project) selectOneLpr.getReturnObject();
            if (temp.getTeacherid() - project.getTeacherid() == 0) {
                Project project1 = this.projectService.updateApplication(project.getId(), 1, project.getStudentnumber());
                if (project1 == null) {
                    key = false;
                    lpr.setWhy("申请失败");
                } else {
                    lpr.setWhy("申请成功");
                }
                lpr.setReturnObject(project1);
            } else {
                key = false;
                lpr.setWhy("没有权限");
            }
        } else {
            key = false;
            lpr.setWhy("没有数据");
        }
        lpr.setReturnKey(key);
        return lpr;
    }





}