package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/selectOne")
    public Project selectOne(Integer id) {
        return this.projectService.queryById(id);
    }


    @ApiOperation(value = "添加毕设题目信息")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Project project) {
        LPR lpr = new LPR();
        lpr.setWhat("添加毕设题目信息");
        boolean key = true;
        Project project1 = this.projectService.insert(project);
        if (project1 == null) {
            key = false;
            lpr.setWhy("添加失败");
        } else {
            lpr.setWhy("添加成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(project1);
        return lpr;
    }


}