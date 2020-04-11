package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.service.SelecttitleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 选题表(Selecttitle)表控制层
 *
 * @author makejava
 * @since 2020-04-12 00:39:39
 */
@RestController
@RequestMapping("selecttitle")
public class SelecttitleController {
    /**
     * 服务对象
     */
    @Resource
    private SelecttitleService selecttitleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Selecttitle selectOne(Integer id) {
        return this.selecttitleService.queryById(id);
    }

}