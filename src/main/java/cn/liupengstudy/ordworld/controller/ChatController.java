package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Chat;
import cn.liupengstudy.ordworld.entity.Conservator;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.Teacher;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.entity.tools.LiuPengChatdata;
import cn.liupengstudy.ordworld.entity.tools.LiuPengData;
import cn.liupengstudy.ordworld.service.ChatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天信息表(Chat)表控制层
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */

@RestController
@RequestMapping("/chat")
@Api(tags = "聊天控制器")
@SuppressWarnings("unchecked")
public class ChatController {
    /**
     * 服务对象
     */
    @Resource
    private ChatService chatService;

    @Autowired
    private StudentController studentController;

    @Autowired
    private TeacherController teacherController;

    /**
     * 通过主键查询单条数据
     */
    @ApiOperation(value = "通过ID获取信息")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR selectOne(@RequestBody Chat chat) {
        LPR lpr = new LPR();
        boolean key = true;
        lpr.setWhat("通过ID获取信息");
        Chat chat1 = this.chatService.queryById(chat.getId());
        if (chat1 == null) { key = false; }
        lpr.setReturnKey(key);
        lpr.setReturnObject(chat1);
        return lpr;
    }

    @ApiOperation(value = "添加聊天信息")
    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR add(@RequestBody Chat chat) {
        LPR lpr = new LPR();
        boolean key = true;
        lpr.setWhat("添加聊天信息");
        if (chat.getGroupid()== 0) {
            key = false;
            lpr.setWhy("添加失败");
        } else {
            LiuPengData liuPengData = new LiuPengData();
            chat.setYear(Integer.valueOf(liuPengData.getYear()));
            chat.setMonth(Integer.valueOf(liuPengData.getMonth()));
            chat.setDay(Integer.valueOf(liuPengData.getDay()));
            chat.setHour(Integer.valueOf(liuPengData.getHours()));
            chat.setMoment(Integer.valueOf(liuPengData.getMinutes()));
            chat.setSecond(Integer.valueOf(liuPengData.getSeconds()));
            Chat chat1 = this.chatService.insert(chat);
            if (chat1 == null) {
                key = false;
                lpr.setWhy("添加失败");
            } else {
                lpr.setWhy("添加成功");
            }
            lpr.setReturnObject(chat1);
        }
        lpr.setReturnKey(key);
        return lpr;
    }


    @ApiOperation(value = "获取聊天信息")
    @RequestMapping(path = "/getByGroupID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR getByGroupID(@RequestBody Chat chat) {
        LPR lpr = new LPR();
        boolean key = true;
        lpr.setWhat("获取聊天信息");
        List<Chat> list = this.chatService.getByGroupID(chat.getGroupid());
        List<LiuPengChatdata> chatList = new ArrayList<LiuPengChatdata>();
        if (list.size() <= 0) { key = false; }
        if (list.size() > 200) {
            list = list.subList(0, 200);
        }
        for (Chat chatTemp : list) {
            LiuPengChatdata liuPengChatdata = new LiuPengChatdata();
            if (chatTemp.getType() - 2 == 0) {
                liuPengChatdata.setAutorchType(2);
                // 教师
                Teacher teacher = new Teacher();
                teacher.setTeachernumber(chatTemp.getAuthorid().toString());
                //System.out.println(teacher.toString());
                LPR getTeagcerLpr = this.teacherController.selectByNumber(teacher);
                //System.out.println(getTeagcerLpr.toString());
                if (getTeagcerLpr.isReturnKey()) {
                    teacher = (Teacher) getTeagcerLpr.getReturnObject();
                    liuPengChatdata.setObject(teacher);
                }
                liuPengChatdata.setChat(chatTemp);
            } else if (chatTemp.getType() - 3 == 0) {
                liuPengChatdata.setAutorchType(3);
                // 学生
                Student student = new Student();
                student.setStudentid(chatTemp.getAuthorid().toString());
                LPR getStudentLpr = this.studentController.selectByStudentID(student);
                if (getStudentLpr.isReturnKey()) {
                    student = (Student) getStudentLpr.getReturnObject();
                    liuPengChatdata.setObject(student);
                }
                liuPengChatdata.setChat(chatTemp);
            } else {
                continue;
            }
            chatList.add(liuPengChatdata);
        }
        lpr.setReturnKey(key);
        lpr.setReturnObject(chatList);
        return lpr;
    }

}