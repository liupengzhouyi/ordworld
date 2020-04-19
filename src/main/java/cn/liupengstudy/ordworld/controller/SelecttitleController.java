package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LiuPengData;
import cn.liupengstudy.ordworld.service.SelecttitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Autowired
    private StudentController studentController;

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
        Student student = new Student();
        student.setStudentid(selecttitle.getStudentid() + "");
        LPR studentNumberToIDLpr = this.studentNumberToID(student);
        if (studentNumberToIDLpr.isReturnKey()) {
            selecttitle.setStudentid((Integer) studentNumberToIDLpr.getReturnObject());
        } else {
            lpr.setWhy("添加失败, 没有该学生");
            key = false;
            lpr.setReturnKey(key);
            return lpr;
        }
        LPR getAllByStudentLpr = this.getAllByStudent(selecttitle);
        if (getAllByStudentLpr.isReturnKey()) {
            List<Selecttitle> list = (List<Selecttitle>) getAllByStudentLpr.getReturnObject();
            for (Selecttitle temp : list) {
                if (temp.getPass() - 1 == 0) {
                    lpr.setWhy("添加失败, 已选题");
                    key = false;
                    lpr.setReturnKey(key);
                    return lpr;
                }
            }
            for (Selecttitle temp : list) {
                if (temp.getTitleid() - selecttitle.getTitleid() == 0) {
                    lpr.setWhy("添加失败, 已申请");
                    key = false;
                } else {
                    LiuPengData liuPengData = new LiuPengData();
                    selecttitle.setApplicationdata(liuPengData.getLpData());
                    System.out.println(selecttitle.toString());
                    Selecttitle selecttitle1 = this.selecttitleService.insert(selecttitle);
                    if (selecttitle1 == null) {
                        lpr.setWhy("添加失败");
                        key = false;
                    } else {
                        lpr.setWhy("添加成功");
                        lpr.setReturnObject(selecttitle1);
                    }
                }
            }
        } else {
            Selecttitle selecttitle1 = this.selecttitleService.insert(selecttitle);
            if (selecttitle1 == null) {
                lpr.setWhy("添加失败");
                key = false;
            } else {
                lpr.setWhy("添加成功");
                lpr.setReturnObject(selecttitle1);
            }
        }
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

    /**
     * @描述  在学生ID的权限下，删除该申请
     * @参数  [selecttitle]
     * @返回值  cn.liupengstudy.ordworld.entity.tools.LPR
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/4/12 - 3:00 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "学生撤销选题申请信息")
    @RequestMapping(path = "/reApplicationByStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR reApplicationByStudent(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("学生撤销选题申请信息");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(selecttitle);
        if (selectOneLpr.isReturnKey()) {
            Selecttitle temp = (Selecttitle) selectOneLpr.getReturnObject();
            if(temp.getPass() == 0) {
                if (temp.getStudentid() - selecttitle.getStudentid() == 0) {
                    boolean deleteKey = this.selecttitleService.deleteById(temp.getId());
                    if (deleteKey) {
                        lpr.setWhy("撤销申请信息成功");
                        lpr.setReturnObject(temp);
                    } else {
                        key = false;
                        lpr.setWhy("撤销申请信息失败");
                    }
                } else {
                    key = false;
                    lpr.setWhy("没有权限撤销申请信息");
                }
            } else {
                key = false;
                lpr.setWhy("教师已处理，没有权限撤销申请信息");
            }
        } else {
            key = false;
            lpr.setWhy("没有该申请信息");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "查询学生所有选题申请信息")
    @RequestMapping(path = "/getAllByStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByStudent(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("查询学生所有选题申请信息");
        boolean key = true;
        List<Selecttitle> list = this.selecttitleService.queryAllByStudentID(selecttitle.getStudentid());
        if (list.size() <= 0) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnObject(list);
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "通过题目ID查询所有选题申请信息")
    @RequestMapping(path = "/getAllByTitle", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getAllByTitle(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("查询题目所有选题申请信息");
        boolean key = true;
        List<Selecttitle> list = this.selecttitleService.queryAllByTitleID(selecttitle.getTitleid());
        if (list.size() <= 0) {
            lpr.setWhy("查询失败");
            key = false;
        } else {
            lpr.setWhy("查询成功");
        }
        lpr.setReturnObject(list);
        lpr.setReturnKey(key);
        return lpr;
    }

    /**
     * @描述  在申请通过时候继续申请撤销
     * @参数  [selecttitle]
     * @返回值  cn.liupengstudy.ordworld.entity.tools.LPR
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/4/12 - 3:52 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "学生申请撤销选题")
    @RequestMapping(path = "/reApplicationAfterPass", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR reApplicationAfterPass(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("学生申请撤销选题");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(selecttitle);
        if (selectOneLpr.isReturnKey()) {
            Selecttitle temp = (Selecttitle) selectOneLpr.getReturnObject();
            if(temp.getPass() == 1) {
                if (temp.getStudentid() - selecttitle.getStudentid() == 0) {
                    Selecttitle selecttitle1 = this.selecttitleService.passApplication(selecttitle.getId(), 99);
                    if (selecttitle1 == null) {
                        key = false;
                        lpr.setWhy("申请撤销失败");
                    } else {
                        lpr.setWhy("申请撤销成功");
                        lpr.setReturnObject(selecttitle1);
                    }
                } else {
                    key = false;
                    lpr.setWhy("没有权限撤销申请信息");
                }
            } else {
                key = false;
                lpr.setWhy("教师未处理，无法申请撤销");
            }
        } else {
            key = false;
            lpr.setWhy("没有该申请信息");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生申请通过")
    @RequestMapping(path = "/pass", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR pass(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("学生申请通过");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(selecttitle);
        if (selectOneLpr.isReturnKey()) {
            Selecttitle temp = (Selecttitle) selectOneLpr.getReturnObject();
            Selecttitle selecttitle1 = this.selecttitleService.passApplication(temp.getId(), 1);
            if (selecttitle1 == null) {
                key = false;
                lpr.setWhy("申请信息通过失败，请重试");
            } else {
                lpr.setWhy("申请信息通过");
                lpr.setReturnObject(selecttitle1);
                // 设置该同学其他申请不通过
                LPR getAllByStudentLpr = this.getAllByStudent(selecttitle);
                List<Selecttitle> list1 = (List<Selecttitle>) getAllByStudentLpr.getReturnObject();
                for (Selecttitle s : list1) {
                    if (s.getId() - selecttitle.getId() != 0) {
                        this.selecttitleService.passApplication(s.getId(), -1);
                    }
                }
                // 设置该题目的其他申请不通过
                LPR getAllByTitleLpr = this.getAllByTitle(selecttitle);
                List<Selecttitle> list2 = (List<Selecttitle>) getAllByTitleLpr.getReturnObject();
                for (Selecttitle s : list2) {
                    if (s.getId() - selecttitle.getId() != 0) {
                        this.selecttitleService.passApplication(s.getId(), -1);
                    }
                }
            }
        } else {
            key = false;
            lpr.setWhy("没有该申请信息");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生申请不通过")
    @RequestMapping(path = "/notPass", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR notPass(@RequestBody Selecttitle selecttitle) {
        LPR lpr = new LPR();
        lpr.setWhat("学生申请不通过");
        boolean key = true;
        LPR selectOneLpr = this.selectOne(selecttitle);
        if (selectOneLpr.isReturnKey()) {
            Selecttitle temp = (Selecttitle) selectOneLpr.getReturnObject();
            Selecttitle selecttitle1 = this.selecttitleService.passApplication(temp.getId(), -1);
            if (selecttitle1 == null) {
                key = false;
                lpr.setWhy("申请信息通过失败，请重试");
            } else {
                lpr.setWhy("申请信息通过");
                lpr.setReturnObject(selecttitle1);
            }
        } else {
            key = false;
            lpr.setWhy("没有该申请信息");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    @ApiOperation(value = "学生学号转学生ID")
    @RequestMapping(path = "/studentNumberToID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR studentNumberToID(@RequestBody Student student) {
        LPR lpr = new LPR();
        lpr.setWhat("学生学号转学生ID");
        boolean key = true;
        LPR selectByPhoneNumberLpr = this.studentController.selectByStudentID(student);
        if (selectByPhoneNumberLpr.isReturnKey()) {
            Student student1 = (Student) selectByPhoneNumberLpr.getReturnObject();
            lpr.setReturnObject(student1.getId());
        } else {
            key = false;
            lpr.setWhy("没有该数据");
        }
        lpr.setReturnKey(key);
        return lpr;
    }

}