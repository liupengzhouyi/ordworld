package cn.liupengstudy.ordworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("/")
    String home(String name) {
        return "Hello " + name + "!";
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
    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }

}

