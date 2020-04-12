package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.Chat;
import cn.liupengstudy.ordworld.entity.Conservator;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.ChatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 聊天信息表(Chat)表控制层
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */

@RestController
@RequestMapping("/chat")
@Api(tags = "聊天控制器")
public class ChatController {
    /**
     * 服务对象
     */
    @Resource
    private ChatService chatService;

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

}