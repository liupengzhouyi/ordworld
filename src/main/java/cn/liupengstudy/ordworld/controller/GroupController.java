package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Conservator;
import cn.liupengstudy.ordworld.entity.Group;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LpPassword;
import cn.liupengstudy.ordworld.service.GroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 讨论组表(Group)表控制层
 *
 * @author makejava
 * @since 2020-04-12 21:29:32
 */

@RestController
@RequestMapping("/group")
@Api(tags = "讨论组控制器")
public class GroupController {
    /**
     * 服务对象
     */
    @Resource
    private GroupService groupService;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过讨论组ID讨论组")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody Group group) {
        LPR lpr = new LPR();
        lpr.setWhat("通过讨论组ID讨论组");
        boolean key = true;
        Group group1 = this.groupService.queryById(group.getId());
        if (group1 == null) {
            lpr.setWhy("没有数据");
            key = false;
        } else {
            lpr.setWhy("查找成功");
        }
        lpr.setReturnObject(group1);
        lpr.setReturnKey(key);
        return lpr;

    }

    @ApiOperation(value = "创建讨论组")
    @RequestMapping(path = "/create", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR create(@RequestBody Group group){
        LPR lpr = new LPR();
        lpr.setWhat("创建讨论组");
        boolean key = true;
        LPR getAllByTeacherIdLpr = this.getAllByTeacherId(group);
        if (getAllByTeacherIdLpr.isReturnKey()) {
            List<Group> list = (List<Group>) getAllByTeacherIdLpr.getReturnObject();
            int t = 0;
            for (Group tempGroup : list) {
                if (tempGroup.getName().equals(group.getName().replace(" ", ""))) {
                    t = 1;
                }
            }
            if (t - 1 == 0) {
                lpr.setWhy("添加失败,您已注册同名小组");
                key = false;
            } else {
                Group group1 = this.groupService.insert(group);
                if (group1 == null) {
                    lpr.setWhy("添加失败");
                    key = false;
                } else {
                    lpr.setWhy("添加成功");
                }
            }
        } else {
            Group group1 = this.groupService.insert(group);
            if (group1 == null) {
                lpr.setWhy("添加失败");
                key = false;
            } else {
                lpr.setWhy("添加成功");
            }
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "查询教师所有讨论组")
    @RequestMapping(path = "/getAllByTeacherId", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTeacherId(@RequestBody Group group) {
        LPR lpr = new LPR();
        lpr.setWhat("创建讨论组");
        boolean key = true;
        List<Group> list = this.groupService.getAllByTeacherId(group.getTeacherid());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据");
            key = false;
        } else {
            lpr.setWhy("查找成功");
        }
        lpr.setReturnObject(list);
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组修改名称")
    @RequestMapping(path = "/reName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR reName(@RequestBody Group group) {
        LPR lpr = new LPR();
        lpr.setWhat("讨论组修改名称");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(group);
        if (selectOneLpr.isReturnKey()) {
            Group temp = (Group) selectOneLpr.getReturnObject();
            if (temp.getName().equals(group.getName().replace(" ", ""))) {
                Group temp1 = this.groupService.reName(group.getId(), group.getName());
                if (temp1 == null) {
                    lpr.setWhy("修改失败");
                    key = false;
                } else {
                    lpr.setWhy("修改成功");
                    lpr.setReturnObject(temp1);
                }
            } else {
                lpr.setWhy("没有权限");
                key = false;
            }
        } else {
            lpr.setWhy("无讨论组");
            key = false;
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组修改头像")
    @RequestMapping(path = "/reImage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR reImage(@RequestBody Group group) {
        LPR lpr = new LPR();
        lpr.setWhat("讨论组修改头像");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(group);
        if (selectOneLpr.isReturnKey()) {
            Group temp = (Group) selectOneLpr.getReturnObject();
            if (temp.getName().equals(group.getName().replace(" ", ""))) {
                Group temp1 = this.groupService.reImage(group);
                if (temp1 == null) {
                    lpr.setWhy("修改失败");
                    key = false;
                } else {
                    lpr.setWhy("修改成功");
                    lpr.setReturnObject(temp1);
                }
            } else {
                lpr.setWhy("没有权限");
                key = false;
            }
        } else {
            lpr.setWhy("无讨论组");
            key = false;
        }
        lpr.setReturnKey(key);
        return lpr;
    }
}