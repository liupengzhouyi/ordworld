package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.service.ConservatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class ConservatorController {

    @Autowired
    private ConservatorServiceImpl conservatorService;

    @RequestMapping("/selectByPrimaryKey")
    String home() {
        String s = this.conservatorService.selectByPrimaryKey(1).toString();
        System.out.println(s);
        return s;
    }

}
