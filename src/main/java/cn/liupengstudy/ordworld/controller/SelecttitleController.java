package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.SelecttitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 选题表(Selecttitle)表控制层
 *
 * @author makejava
 * @since 2020-04-12 00:39:39
 */
@RestController
@RequestMapping("/selecttitle")
@Api(tags = "选题管理控制器")
public class SelecttitleController {
    /**
     * 服务对象
     */
    @Resource
    private SelecttitleService selecttitleService;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过ID查询选题申请信息")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查询选题申请信息");
        boolean key = true;
        Selecttitle selecttitle1 = this.selecttitleService.queryById(selecttitle.getId());
        if (selecttitle1 == null) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnObject(selecttitle1);
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "添加选题申请信息")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("添加选题申请信息");
        boolean key = true;
        Selecttitle selecttitle1 = this.selecttitleService.insert(selecttitle);
        if (selecttitle1 == null) {
            lpr.setWhy("添加失败");
            key = false;
        } else {
            lpr.setWhy("添加成功");
        }
        lpr.setReturnObject(selecttitle1);
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "查询申请信息是否通过")
    @RequestMapping(path = "/findRepeat1", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR findRepeat1(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("查询申请信息是否通过");
        boolean key = true;
        Selecttitle selecttitle1 = this.selecttitleService.queryRepeat(selecttitle.getStudentid(), selecttitle.getTitleid(), 1);
        if (selecttitle1 == null) {
            lpr.setWhy("查询失败，未通过申请");
            key = false;
        } else {
            lpr.setWhy("查询成功, 已通过申请");
        }
        lpr.setReturnObject(selecttitle1);
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "查询重复选题申请信息")
    @RequestMapping(path = "/findRepeat2", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR findRepeat2(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("查询重复选题申请信息");
        boolean key = true;
        Selecttitle selecttitle1 = this.selecttitleService.queryRepeat(selecttitle.getStudentid(), selecttitle.getTitleid(), 0);
        if (selecttitle1 == null) {
            lpr.setWhy("查询失败，没有该信息");
            key = false;
        } else {
            lpr.setWhy("查询成功, 已申请");
        }
        lpr.setReturnObject(selecttitle1);
        lpr.setReturnKey(key);
        return lpr;
    }

}