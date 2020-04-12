package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Conservator;
import cn.liupengstudy.ordworld.entity.Groupnumber;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.GroupnumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Groupnumber)表控制层
 *
 * @author makejava
 * @since 2020-04-12 23:09:29
 */
@RestController
@RequestMapping("/groupnumber")
@Api(tags = "讨论组成员控制器")
public class GroupnumberController {
    /**
     * 服务对象
     */
    @Resource
    private GroupnumberService groupnumberService;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过ID查询")
    @RequestMapping(path = "/selectByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByID(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询");
        boolean key = true;
        Groupnumber groupnumber1 = this.groupnumberService.queryById(groupnumber.getId());
        if (groupnumber1 == null) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(groupnumber1);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组添加成员")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("讨论组添加成员");
        boolean key = true;
        Groupnumber groupnumber1 = this.groupnumberService.insert(groupnumber);
        if (groupnumber1 == null) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(groupnumber1);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组删除成员")
    @RequestMapping(path = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR delete(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("讨论组删除成员");
        boolean key = this.groupnumberService.deleteById(groupnumber.getId());
        if (key) {
            lpr.setWhy("删除失败");
        } else {
            lpr.setWhy("删除成功");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "讨论组获取成员")
    @RequestMapping(path = "/getAllNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllNumber(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询");
        boolean key = true;
        List<Groupnumber> list = this.groupnumberService.getAllNumber(groupnumber);
        if (list.size() <= 0) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(list);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "成员获取讨论组")
    @RequestMapping(path = "/getAllGroup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllGroup(@RequestBody Groupnumber groupnumber) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询");
        boolean key = true;
        List<Groupnumber> list = this.groupnumberService.getAllGroup(groupnumber);
        if (list.size() <= 0) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
            lpr.setReturnObject(list);
        }
        lpr.setReturnKey(key);
        return lpr;
    }
}