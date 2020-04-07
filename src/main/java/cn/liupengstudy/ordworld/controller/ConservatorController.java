package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.pojo.Conservator;
import cn.liupengstudy.ordworld.pojo.tools.LPR;
import cn.liupengstudy.ordworld.pojo.tools.LpPassword;
import cn.liupengstudy.ordworld.pojo.tools.ReConservator;
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

    @ApiOperation(value = "管理员注册")
    @RequestMapping(path = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR register(@RequestBody Conservator conservator) {
        LPR lpr = new LPR();
        lpr.setWhat("管理员注册");
        boolean key = true;
        if (conservator.getPhonenumber().length() != 11) {
            key = false;
            lpr.setWhy("电话号码错误");
            lpr.setReturnKey(key);
            lpr.setReturnObject(null);
        } else {
            LPR selectPhoneNumber = this.selectPhoneNumber(conservator);
            if (!selectPhoneNumber.isReturnKey()) {
                if (conservator.getPassword() == 0) {
                    lpr.setWhy("没有输入，不可以注册");
                    lpr.setReturnKey(key);
                    lpr.setReturnObject(null);
                } else {
                    lpr.setWhy("电话号码没有重复，可以注册");
                    LpPassword lpPassword = new LpPassword(conservator.getPhonenumber(), conservator.getPassword() + "");
                    conservator.setPassword(lpPassword.getPasswordValue());
                    int registerKey = this.conservatorService.insert(conservator);
                    System.out.println(registerKey);
                    if (registerKey == 1) {
                        lpr.setWhy("注册成功");
                    } else {
                        key = false;
                        lpr.setWhy("注册失败");
                    }
                    lpr.setReturnKey(key);
                    lpr.setReturnObject(registerKey);
                }

            } else {
                lpr.setWhy("电话号码重复，不可以注册");
                lpr.setReturnKey(key);
                lpr.setReturnObject(null);
            }
        }
        return lpr;
    }

    @ApiOperation(value = "管理员登陆")
    @RequestMapping(path = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR landing(@RequestBody Conservator conservator) {
        LPR lpr = new LPR();
        lpr.setWhat("管理员登陆");
        boolean key = true;
        LPR selectPhonrNumber = this.selectPhoneNumber(conservator);
        if (selectPhonrNumber.isReturnKey()) {
            lpr.setWhy("账号存在");
            LpPassword lpPassword = new LpPassword(conservator.getPhonenumber(), conservator.getPassword() + "");
            List<Conservator> list = (List<Conservator>) selectPhonrNumber.getReturnObject();
            if (list.get(0).getPassword() == lpPassword.getPasswordValue()) {
                lpr.setWhy("密码正确");
            } else {
                key = false;
                lpr.setWhy("密码不正确");
            }
        } else {
            key = false;
            lpr.setWhy("账号不存在");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "管理员修改密码")
    @RequestMapping(path = "/rePassword", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR rePassword(@RequestBody ReConservator reConservator) {
        LPR lpr = new LPR();
        lpr.setWhat("管理员修改密码");
        boolean key = true;
        LPR landingLPR = this.landing(reConservator.getConservator());
        if (landingLPR.isReturnKey()) {
            LPR selectPhonrNumber = this.selectPhoneNumber(reConservator.getConservator());
            List<Conservator> list = (List<Conservator>) selectPhonrNumber.getReturnObject();
            LpPassword lpPassword = new LpPassword(reConservator.getConservator().getPhonenumber(), reConservator.getPassword());
            list.get(0).setPassword(lpPassword.getPasswordValue());
            int updateKey = this.conservatorService.updateByPrimaryKey(list.get(0));
            if (updateKey == 1) {
                lpr.setWhy("更新成功");
            } else {
                key = false;
                lpr.setWhy("更新失败");
            }
        } else {
            key = false;
            lpr.setWhy(landingLPR.getWhy());
        }


        lpr.setReturnKey(key);
        return lpr;
    }
}
