package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Group;
import cn.liupengstudy.ordworld.service.GroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 讨论组表(Group)表控制层
 *
 * @author makejava
 * @since 2020-04-12 21:29:32
 */
@RestController
@RequestMapping("group")
public class GroupController {
    /**
     * 服务对象
     */
    @Resource
    private GroupService groupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Group selectOne(Integer id) {
        return this.groupService.queryById(id);
    }

}