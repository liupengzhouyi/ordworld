package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.pojo.Conservator;
import cn.liupengstudy.ordworld.pojo.SystemInformation;
import cn.liupengstudy.ordworld.pojo.tools.LPR;
import cn.liupengstudy.ordworld.service.SystemInformationServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.ordworld.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/8 - 2:23 下午
 * @修改人和其它信息
 */

@RestController
@RequestMapping("/SystemInformation")
@Api(tags = "系统公告控制器")
public class SystemInformationController {

    @Autowired
    private SystemInformationServiceImpl systemInformationService;

    @ApiOperation(value = "添加系统公告信息")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR addSystemInformation(@RequestBody SystemInformation systemInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("添加系统公告信息");
        boolean addKey = true;
        int key = this.systemInformationService.insert(systemInformation);
        if (key != 1) {
            addKey = false;
            lpr.setWhy("添加失败");
        } else {
            lpr.setWhy("添加成功");
        }
        lpr.setReturnKey(addKey);
        lpr.setReturnObject(key);
        return lpr;
    }

    @ApiOperation(value = "查询所有系统公告信息")
    @RequestMapping(path = "/getAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAll() {
        LPR lpr = new LPR();
        lpr.setWhat("查询所有系统公告信息");
        boolean key = true;
        List<SystemInformation> list = this.systemInformationService.getAll();
        if (list.size() <= 0) {
            lpr.setWhy("没有查询到数据");
            key = false;
        } else {
            lpr.setWhy("查询到数据");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "通过ID查询系统公告信息")
    @RequestMapping(path = "/select", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR select(@RequestBody SystemInformation systemInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询系统公告信息");
        boolean key = true;
        SystemInformation systemInformation1 = this.systemInformationService.selectByPrimaryKey(systemInformation.getId());
        if (systemInformation1 == null) {
            key = false;
            lpr.setWhy("查询失败");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(systemInformation1);
        return lpr;
    }

    @ApiOperation(value = "删除系统公告信息")
    @RequestMapping(path = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR delete(@RequestBody SystemInformation systemInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("删除系统公告信息");
        boolean key = true;
        LPR selectLpr = this.select(systemInformation);
        if (selectLpr.isReturnKey()) {
            SystemInformation temp = (SystemInformation) selectLpr.getReturnObject();
            if (temp.getAuthorid() == systemInformation.getAuthorid()) {
                int returnKey = this.systemInformationService.deleteByPrimaryKey(systemInformation.getId());
                if (returnKey == 1) {
                    lpr.setWhy("数据删除成功");
                } else {
                    lpr.setWhy("数据删除失败");
                    key = false;
                }
            } else {
                lpr.setWhy("你不是该公告的作者，没有权限删除数据");
                key = false;
            }
        } else {
            lpr.setWhy("数据不存在");
            key = false;
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "通过管理员ID查询系统公告信息")
    @RequestMapping(path = "/selectByAuthor", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByAuthor(@RequestBody SystemInformation systemInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("通过管理员ID查询系统公告信息");
        boolean key = true;
        List<SystemInformation> list = this.systemInformationService.selectByAuthor(systemInformation.getAuthorid());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询到数据");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "通过年查询系统公告信息")
    @RequestMapping(path = "/selectByYear", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByYear(@RequestBody SystemInformation systemInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("通过年查询系统公告信息");
        boolean key = true;
        List<SystemInformation> list = this.systemInformationService.selectByYear(systemInformation.getLpyear());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询到数据");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }
}
