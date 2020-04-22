package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Projectfile;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LiuPengData;
import cn.liupengstudy.ordworld.entity.tools.LiuPengVersion;
import cn.liupengstudy.ordworld.service.ProjectfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
        projectfile.setUpladdata(liuPengData.getLpData());
        LiuPengVersion liuPengVersion = new LiuPengVersion();
        projectfile.setVersion(liuPengVersion.getStringVersion());
        projectfile.setName(projectfile.getName().replace(" ", ""));
        projectfile.setVersionkey(1);
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

    @ApiOperation(value = "更新毕设文件")
    @RequestMapping(path = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR update(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("上传毕设文件");
        boolean key = true;
        // 查找上一个版本
        projectfile.setName(projectfile.getName().replace(" ", ""));
        List<Projectfile> list01 = this.projectfileService.queryAllByVersionTrue(projectfile.getTitleid(), projectfile.getName(), 1);
        if (list01.size() == 0) {
            key = false;
            lpr.setWhy("该题目无法信息，这是第一个");
        } else {
            Projectfile temp = list01.get(0);
            temp.setVersionkey(0);
            // 设置上一个版本过期
            this.projectfileService.update(temp);
            // 设置上传日期
            LiuPengData liuPengData = new LiuPengData();
            projectfile.setUpladdata(liuPengData.getLpData());
            // 设置新的版本
            LiuPengVersion liuPengVersion = new LiuPengVersion(temp.getVersion());
            liuPengVersion.add();
            projectfile.setVersion(liuPengVersion.getStringVersion());
            // 设置版本有效
            projectfile.setVersionkey(1);
            Projectfile newVersion = this.projectfileService.insert(projectfile);
            if (newVersion == null) {
                key = false;
                lpr.setWhy("添加失败");
            } else {
                lpr.setWhy("添加成功");
            }
            lpr.setReturnObject(temp);
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "通过题目ID查询所有的上传毕设文件")
    @RequestMapping(path = "/getAllByTiitleId", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTitleId(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("通过题目ID查询所有的上传毕设文件");
        boolean key = true;
        List<Projectfile> list = this.projectfileService.queryAllByTitleId(projectfile.getTitleid());
        if (list.size() == 0) {
            key = false;
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "通过题目ID查询所有的上传毕设文件有效文件")
    @RequestMapping(path = "/getAllByTiitleIdTrue", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTitleIdTrue(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("通过题目ID查询所有的上传毕设文件有效文件");
        boolean key = true;
        List<Projectfile> list = this.projectfileService.queryAllByTitleIdTure(projectfile.getTitleid(), 1);
        if (list.size() == 0) {
            key = false;
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "通过题目ID查询所有的上传毕设文件内容的所有文件")
    @RequestMapping(path = "/getAllByTitleIdAndName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTitleIdAndName(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("通过题目ID查询所有的上传毕设文件内容的所有文件");
        boolean key = true;
        projectfile.setName(projectfile.getName().replace(" ", ""));
        List<Projectfile> list = this.projectfileService.queryAllByVersion(projectfile.getTitleid(), projectfile.getName());
        if (list.size() == 0) {
            key = false;
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "通过题目ID查询所有的上传毕设文件内容的历史文件")
    @RequestMapping(path = "/getAllByTitleIdAndNameFalse", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTitleIdAndNameFalse(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("通过题目ID查询所有的上传毕设文件内容的历史文件");
        boolean key = true;
        projectfile.setName(projectfile.getName().replace(" ", ""));
        List<Projectfile> list = this.projectfileService.queryAllByVersionTrue(projectfile.getTitleid(), projectfile.getName(), 0);
        if (list.size() == 0) {
            key = false;
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "通过题目ID查询所有的上传毕设文件内容的有效文件")
    @RequestMapping(path = "/getAllByTitleIdAndNameTrue", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTitleIdAndNameTrue(@RequestBody Projectfile projectfile) {
        LPR lpr = new LPR();
        lpr.setWhat("通过题目ID查询所有的上传毕设文件内容的有效文件");
        boolean key = true;
        projectfile.setName(projectfile.getName().replace(" ", ""));
        List<Projectfile> list = this.projectfileService.queryAllByVersionTrue(projectfile.getTitleid(), projectfile.getName(), 1);
        if (list.size() == 0) {
            key = false;
            lpr.setWhy("没有数据");
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

}