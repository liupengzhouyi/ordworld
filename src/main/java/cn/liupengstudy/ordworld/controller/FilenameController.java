package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Filename;
import cn.liupengstudy.ordworld.service.FilenameService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文件名表(Filename)表控制层
 *
 * @author makejava
 * @since 2020-04-16 22:25:18
 */
@RestController
@RequestMapping("filename")
public class FilenameController {
    /**
     * 服务对象
     */
    @Resource
    private FilenameService filenameService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Filename selectOne(Integer id) {
        return this.filenameService.queryById(id);
    }

}