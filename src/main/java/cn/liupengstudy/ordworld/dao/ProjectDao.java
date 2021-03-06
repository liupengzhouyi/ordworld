package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 毕设题目(Project)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-09 19:16:54
 */
@Mapper
public interface ProjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Project queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Project> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Project> queryAllByConservator();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param project 实例对象
     * @return 对象列表
     */
    List<Project> queryAll(Project project);

    List<Project> findSame(@Param("teacherId")int teacherId, @Param("title")String title);

    List<Project> getAllByTeacherId(@Param("teacherId")int teacherId);

    List<Project> findStudentApplication(@Param("studentnumber")String studentnumber);
    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 影响行数
     */
    int insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 影响行数
     */
    int update(Project project);

    int updateApplication(@Param("id")int id, @Param("isselect")int isselect, @Param("studentnumber")String studentnumber);

    int reUpdateApplication(@Param("id")int id,@Param("isselect")int isselect, @Param("studentnumber")String studentnumber);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}