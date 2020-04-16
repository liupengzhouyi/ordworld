package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Filename;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 文件名表(Filename)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-16 22:25:18
 */
@Mapper
public interface FilenameDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Filename queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Filename> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param filename 实例对象
     * @return 对象列表
     */
    List<Filename> queryAll(Filename filename);

    /**
     * 新增数据
     *
     * @param filename 实例对象
     * @return 影响行数
     */
    int insert(Filename filename);

    /**
     * 修改数据
     *
     * @param filename 实例对象
     * @return 影响行数
     */
    int update(Filename filename);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}