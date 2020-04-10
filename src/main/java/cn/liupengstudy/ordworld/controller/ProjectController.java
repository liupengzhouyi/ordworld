package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 毕设题目(Project)表控制层
 *
 * @author makejava
 * @since 2020-04-09 19:16:54
 */
@RestController
@RequestMapping("project")
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
    @GetMapping("selectOne")
    public Project selectOne(Integer id) {
        return this.projectService.queryById(id);
    }

}