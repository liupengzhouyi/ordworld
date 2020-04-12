package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Chat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 聊天信息表(Chat)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */
@Mapper
public interface ChatDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Chat queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Chat> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Chat> getByGroupID(@Param("groupid") int groupid);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param chat 实例对象
     * @return 对象列表
     */
    List<Chat> queryAll(Chat chat);

    /**
     * 新增数据
     *
     * @param chat 实例对象
     * @return 影响行数
     */
    int insert(Chat chat);

    /**
     * 修改数据
     *
     * @param chat 实例对象
     * @return 影响行数
     */
    int update(Chat chat);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}