package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Projectfile;
import cn.liupengstudy.ordworld.service.ProjectfileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 论文文件表(Projectfile)表控制层
 *
 * @author makejava
 * @since 2020-04-22 13:38:26
 */
@RestController
@RequestMapping("projectfile")
public class ProjectfileController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectfileService projectfileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Projectfile selectOne(Integer id) {
        return this.projectfileService.queryById(id);
    }

}