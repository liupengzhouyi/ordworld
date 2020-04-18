package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.impl.ProfessionallninformationServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.ordworld.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/8 - 9:10 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/Professional")
@Api(tags = "专业信息控制器")
public class ProfessionallninformationController {

    @Autowired
    private ProfessionallninformationServiceImpl professionallninformationService;

    @ApiOperation(value = "添加专业信息")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("添加专业信息");
        boolean k = true;
        int key = this.professionallninformationService.insert(professionalInformation);
        if (key == 1) {
            lpr.setWhy("添加成功");
        } else {
            lpr.setWhy("添加失败");
            k = false;
        }
        lpr.setReturnKey(k);
        lpr.setReturnObject(key);
        return lpr;
    }

    @ApiOperation(value = "通过ID查找专业信息")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("通过ID查找专业信息");
        boolean k = true;
        ProfessionalInformation professionalInformation1 = this.professionallninformationService.selectByPrimaryKey(professionalInformation.getId());
        if (professionalInformation1 == null) {
            lpr.setWhy("查找失败");
            k = false;
        } else {
            lpr.setWhy("查找成功");
        }
        lpr.setReturnKey(k);
        lpr.setReturnObject(professionalInformation1);
        return lpr;
    }

    @ApiOperation(value = "通过专业编号查找专业信息")
    @RequestMapping(path = "/selectByNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectByNumber(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("通过专业编号查找专业信息");
        boolean k = true;
        ProfessionalInformation professionalInformation1 = this.professionallninformationService.selectByNumber(professionalInformation.getNumber());
        if (professionalInformation1 == null) {
            lpr.setWhy("查找失败");
            k = false;
        } else {
            lpr.setWhy("查找成功");
        }
        lpr.setReturnKey(k);
        lpr.setReturnObject(professionalInformation1);
        return lpr;
    }

    @ApiOperation(value = "查找所有专业信息")
    @RequestMapping(path = "/getAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAll() {
        LPR lpr = new LPR();
        lpr.setWhat("查找所有专业信息");
        boolean k = true;
        List<ProfessionalInformation> list = this.professionallninformationService.getAll();
        if (list.size() <= 0) {
            lpr.setWhy("没有数据");
            k = false;
        } else {
            lpr.setWhy("查找成功");
        }
        lpr.setReturnKey(k);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "删除专业信息")
    @RequestMapping(path = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR delete(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("删除专业信息");
        boolean k = true;
        int key  = 0;
        LPR selectByNumberLpr = this.selectByNumber(professionalInformation);
        if (selectByNumberLpr.isReturnKey()) {
            key = this.professionallninformationService.deleteByPrimaryKey(((ProfessionalInformation) selectByNumberLpr.getReturnObject()).getId());
            if (key == 1) {
                lpr.setWhy("删除成功");
            } else {
                k = false;
                lpr.setWhy("删除失败");
            }
        } else {
            k = false;
            lpr.setWhy(selectByNumberLpr.getWhy());
        }
        lpr.setReturnKey(k);
        lpr.setReturnObject(key);
        return lpr;
    }

    @ApiOperation(value = "查找某学院的专业的编号")
    @RequestMapping(path = "/getAllNumberByCollege", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllNumberByCollege(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("查找某学院专业的编号");
        boolean key = true;
        professionalInformation.setCollege(professionalInformation.getCollege().replace(" ", ""));
        List<Integer> list = this.professionallninformationService.getAllByCollege(professionalInformation.getCollege());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据，查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "查找某系的专业的编号")
    @RequestMapping(path = "/getAllNumberByDepartment", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllNumberByDepartment(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("查找某学院专业的编号");
        boolean key = true;
        professionalInformation.setDepartment(professionalInformation.getDepartment().replace(" ", ""));
        List<Integer> list = this.professionallninformationService.getAllByDepartment(professionalInformation.getDepartment());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据，查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }

    @ApiOperation(value = "查找某专业的专业的编号")
    @RequestMapping(path = "/getAllNumberByProfessional", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllNumberByProfessional(@RequestBody ProfessionalInformation professionalInformation) {
        LPR lpr = new LPR();
        lpr.setWhat("查找某学院专业的编号");
        boolean key = true;
        professionalInformation.setProfessional(professionalInformation.getProfessional().replace(" ", ""));
        List<Integer> list = this.professionallninformationService.getAllByProfessional(professionalInformation.getProfessional());
        if (list.size() <= 0) {
            lpr.setWhy("没有数据，查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(list);
        return lpr;
    }


}
