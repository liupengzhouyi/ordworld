package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 毕设题目(Project)表服务接口
 *
 * @author makejava
 * @since 2020-04-09 19:16:54
 */
public interface ProjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Project queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Project> queryAllByLimit(int offset, int limit);

    List<Project> findSame(int teacherId, String title);
    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    Project insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    Project update(Project project);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}