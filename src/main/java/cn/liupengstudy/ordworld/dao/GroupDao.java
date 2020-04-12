package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Group;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 讨论组表(Group)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-12 21:29:32
 */
@Mapper
public interface GroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Group queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Group> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param group 实例对象
     * @return 对象列表
     */
    List<Group> queryAll(Group group);

    List<Group> getAllByTeacherId(@Param("teacherid") int teacherid);

    List<Group> getAll();

    /**
     * 新增数据
     *
     * @param group 实例对象
     * @return 影响行数
     */
    int insert(Group group);

    /**
     * 修改数据
     *
     * @param group 实例对象
     * @return 影响行数
     */
    int update(Group group);

    int reName(Group group);

    int reImage(Group group);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}