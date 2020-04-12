package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Chat;
import java.util.List;

/**
 * 聊天信息表(Chat)表服务接口
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */
public interface ChatService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Chat queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Chat> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param chat 实例对象
     * @return 实例对象
     */
    Chat insert(Chat chat);

    /**
     * 修改数据
     *
     * @param chat 实例对象
     * @return 实例对象
     */
    Chat update(Chat chat);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}