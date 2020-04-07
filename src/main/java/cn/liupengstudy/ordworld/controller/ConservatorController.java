package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.pojo.Conservator;
import cn.liupengstudy.ordworld.pojo.tools.LPR;
import cn.liupengstudy.ordworld.service.ConservatorServiceImpl;
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
 * @创建时间 2020/4/7 - 5:49 下午
 * @修改人和其它信息
 */

@RestController
@RequestMapping("/Conservator")
@Api(tags = "管理员控制器")
public class ConservatorController {

    @Autowired
    private ConservatorServiceImpl conservatorService;

    @ApiOperation(value = "通过管理员ID获取管理员信息")
    @RequestMapping(path = "/selectByPrimaryKey", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getConservatorInformationById(@RequestBody Conservator conservator) {
        LPR lpr = new LPR();
        boolean key = true;
        lpr.setWhat("通过管理员ID获取管理员信息");
        Conservator conservator1 = this.conservatorService.selectByPrimaryKey(conservator.getId());
        if (conservator1 == null) { key = false; }
        lpr.setReturnKey(key);
        lpr.setReturnObject(conservator1);
        return lpr;
    }






    @ApiOperation(value = "管理员电话号码查重")
    @RequestMapping(path = "/selectPhoneNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectPhoneNumber(@RequestBody Conservator conservator) {
        LPR lpr = new LPR();
        boolean key = true;
        List<Conservator> list = this.conservatorService.selectByPhoneNumber(conservator.getPhonenumber());
        lpr.setWhat("管理员电话号码查重");
        if (list.size() == 0) {
            key = false;
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }
}
