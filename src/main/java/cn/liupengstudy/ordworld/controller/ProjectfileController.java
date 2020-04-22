package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Projectfile;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LiuPengData;
import cn.liupengstudy.ordworld.service.ProjectfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 论文文件表(Projectfile)表控制层
 *
 * @author makejava
 * @since 2020-04-22 13:38:26
 */
@RestController
@RequestMapping("projectfile")
@Api(tags = "毕设文件控制器")
public class ProjectfileController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectfileService projectfileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过ID毕设文件")
    @RequestMapping(path = "/selectByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID毕设文件");
        boolean key = true;
        Projectfile temp = this.projectfileService.queryById(projectfile.getId());
        if (temp == null) {
            key = false;
            lpr.setWhy("查询失败");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(temp);
        return lpr;

    }

    @ApiOperation(value = "上传毕设文件")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("上传毕设文件");
        boolean key = true;
        LiuPengData liuPengData = new LiuPengData();
        projectfile.setApprovaldata(liuPengData.getLpData());
        Projectfile temp = this.projectfileService.insert(projectfile);
        if (temp == null) {
            key = false;
            lpr.setWhy("添加失败");
        } else {
            lpr.setWhy("添加成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(temp);
        return lpr;
    }


}