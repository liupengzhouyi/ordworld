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

}
