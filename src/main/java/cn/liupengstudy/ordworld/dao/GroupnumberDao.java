package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Groupnumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Groupnumber)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-12 23:09:29
 */
@Mapper
public interface GroupnumberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Groupnumber queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Groupnumber> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param groupnumber 实例对象
     * @return 对象列表
     */
    List<Groupnumber> queryAll(Groupnumber groupnumber);

    List<Groupnumber> getAllNumber(Groupnumber groupnumber);

    List<Groupnumber> getAllGroup(Groupnumber groupnumber);
    /**
     * 新增数据
     *
     * @param groupnumber 实例对象
     * @return 影响行数
     */
    int insert(Groupnumber groupnumber);

    /**
     * 修改数据
     *
     * @param groupnumber 实例对象
     * @return 影响行数
     */
    int update(Groupnumber groupnumber);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}