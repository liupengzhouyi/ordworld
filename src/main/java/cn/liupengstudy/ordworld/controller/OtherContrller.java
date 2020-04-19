package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.entity.tools.LPR;
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
 * @创建时间 2020/4/20 - 12:16 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/OtherContrller")
@Api(tags = "其他控制器")
public class OtherContrller {

    @Autowired
    private SelecttitleController selecttitleController;
    @ApiOperation(value = "学生通过ID查询选题申请信息")
    @RequestMapping(path = "/studentSelectApplicationTitleInformationByTitle", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByNumber(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();


        return lpr;
    }

}
