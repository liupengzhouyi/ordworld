package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Filename;
import cn.liupengstudy.ordworld.entity.Groupnumber;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.FilenameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文件名表(Filename)表控制层
 *
 * @author makejava
 * @since 2020-04-16 22:25:18
 */

@RestController
@RequestMapping("/filename")
@Api(tags = "文件名称控制器")
public class FilenameController {
    /**
     * 服务对象
     */
    @Resource
    private FilenameService filenameService;

    @ApiOperation(value = "添加File名称")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Filename filename) {
        LPR lpr = new LPR();
        lpr.setWhat("添加File名称");
        boolean key = true;
        LPR selectByFileNameLpr = this.selectByName(filename);
        if (selectByFileNameLpr.isReturnKey()) {
            key = false;
            lpr.setWhy("已经存在相同名称的文件");
        } else {
            Filename filename1 = this.filenameService.insert(filename);
            if (filename1 != null) {
                lpr.setWhy("添加成功");
            } else {
                key = false;
                lpr.setWhy("添加失败");
            }

            lpr.setReturnObject(filename1);
        }
        lpr.setReturnKey(key);
        return lpr;
    }


    @ApiOperation(value = "查找File名称")
    @RequestMapping(path = "/selectByName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByName(@RequestBody Filename filename) {
        LPR lpr = new LPR();
        lpr.setWhat("查找File名称");
        boolean key = true;
        Filename filename1 = this.filenameService.selectByName(filename.getFilename());
        if (filename1 != null) {
            lpr.setWhy("查找成功");
        } else {
            key = false;
            lpr.setWhy("查找失败");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(filename1);
        return lpr;
    }

}