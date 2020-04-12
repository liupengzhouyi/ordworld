package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Group;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 讨论组表(Group)表服务接口
 *
 * @author makejava
 * @since 2020-04-12 21:29:32
 */
public interface GroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Group queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Group> queryAllByLimit(int offset, int limit);

    List<Group> getAllByTeacherId(@Param("teacherid") int teacherid);

    /**
     * 新增数据
     *
     * @param group 实例对象
     * @return 实例对象
     */
    Group insert(Group group);

    /**
     * 修改数据
     *
     * @param group 实例对象
     * @return 实例对象
     */
    Group update(Group group);

    Group reName(int id, String name);

    Group reImage(Group group);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}