/*
package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Tempplay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

*/
/**
 * (Tempplay)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-18 16:43:21
 *//*

@Mapper
public interface TempplayDao {

    */
/**
     * 通过ID查询单条数据
     *
     * @param thisid 主键
     * @return 实例对象
     *//*

    Tempplay queryById(Integer thisid);

    */
/**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     *//*

    List<Tempplay> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    */
/**
     * 通过实体作为筛选条件查询
     *
     * @param tempplay 实例对象
     * @return 对象列表
     *//*

    List<Tempplay> queryAll(Tempplay tempplay);

    List<Tempplay> getAll();

    */
/**
     * 新增数据

     * @param tempplay 实例对象*
     * @return 影响行数
     *//*

    int insert(Tempplay tempplay);

    */
/**
     * 修改数据
     *
     * @param tempplay 实例对象
     * @return 影响行数
     *//*

    int update(Tempplay tempplay);

    */
/**
     * 通过主键删除数据
     *
     * @param thisid 主键
     * @return 影响行数
     *//*

    int deleteById(Integer thisid);

}*/
