package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Selecttitle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 选题表(Selecttitle)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-12 00:39:39
 */
@Mapper
public interface SelecttitleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Selecttitle queryById(Integer id);

    Selecttitle queryRepeat(@Param("studentid") int studentid, @Param("titleid") int titleid, @Param("pass") int pass);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Selecttitle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param selecttitle 实例对象
     * @return 对象列表
     */
    List<Selecttitle> queryAll(Selecttitle selecttitle);

    List<Selecttitle> queryAllByStudentID(@Param("studentid") int studentid);

    /**
     * 新增数据
     *
     * @param selecttitle 实例对象
     * @return 影响行数
     */
    int insert(Selecttitle selecttitle);

    /**
     * 修改数据
     *
     * @param selecttitle 实例对象
     * @return 影响行数
     */
    int update(Selecttitle selecttitle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}