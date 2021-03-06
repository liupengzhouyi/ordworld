package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Chat;
import cn.liupengstudy.ordworld.dao.ChatDao;
import cn.liupengstudy.ordworld.service.ChatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 聊天信息表(Chat)表服务实现类
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */
@Service("chatService")
public class ChatServiceImpl implements ChatService {
    @Resource
    private ChatDao chatDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Chat queryById(Integer id) {
        return this.chatDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Chat> queryAllByLimit(int offset, int limit) {
        return this.chatDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Chat> getByGroupID(int groupid) {
        int L = 100;
        List<Chat> list =  this.chatDao.getByGroupID(groupid);
        int longth = list.size();
        if (longth > L) {
            list = list.subList(longth - L, longth);
        }
        return list;
    }

    /**
     * 新增数据
     *
     * @param chat 实例对象
     * @return 实例对象
     */
    @Override
    public Chat insert(Chat chat) {
        int key = this.chatDao.insert(chat);
        System.out.println(chat.toString());
        if (key == 1) {
            List<Chat> list = this.chatDao.queryAll(chat);
            System.out.println(list.size());
            if (list.size() <= 0) {
                chat = null;
            } else {
                chat = list.get(0);
                System.out.println(chat.toString());
            }
        } else {
            chat = null;
        }
        return chat;
    }

    /**
     * 修改数据
     *
     * @param chat 实例对象
     * @return 实例对象
     */
    @Override
    public Chat update(Chat chat) {
        this.chatDao.update(chat);
        return this.queryById(chat.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.chatDao.deleteById(id) > 0;
    }
}