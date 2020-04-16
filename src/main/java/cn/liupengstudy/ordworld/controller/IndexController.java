package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Conservator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @文件名 cn.liupengstudy.ordworld.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/4 - 2:55 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/indexCationPaper")
@Api(tags = "开始测试控制器")
public class IndexController {

    /**
     * @描述
     * @参数  [name]
     * @返回值  java.lang.String
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/4/4 - 3:07 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "say hello")
    @RequestMapping(path = "/hello", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Conservator home(@RequestBody Conservator conservator) {
        return conservator;
    }


    /**
     * @描述
     * @参数  []
     * @返回值  java.lang.String
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/4/4 - 3:06 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "获取当前时间")
    @RequestMapping(path = "/now", method = {RequestMethod.POST, RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    public Date hehe() {
        System.out.println("fghjfghjfghj1234567586ju5r");
        Date date = new Date();
        return date;
    }

}

