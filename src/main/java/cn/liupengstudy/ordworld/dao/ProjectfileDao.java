package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Projectfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 论文文件表(Projectfile)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-22 13:38:26
 */
@Mapper
public interface ProjectfileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */

    Projectfile queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectfile> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectfile 实例对象
     * @return 对象列表
     */
    List<Projectfile> queryAll(Projectfile projectfile);

    /**
     * 新增数据
     *
     * @param projectfile 实例对象
     * @return 影响行数
     */
    int insert(Projectfile projectfile);

    /**
     * 修改数据
     *
     * @param projectfile 实例对象
     * @return 影响行数
     */
    int update(Projectfile projectfile);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}