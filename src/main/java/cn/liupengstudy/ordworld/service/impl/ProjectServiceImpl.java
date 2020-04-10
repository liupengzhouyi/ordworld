package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.dao.ProjectDao;
import cn.liupengstudy.ordworld.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 毕设题目(Project)表服务实现类
 *
 * @author makejava
 * @since 2020-04-09 19:16:54
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectDao projectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Project queryById(Integer id) {
        return this.projectDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Project> queryAllByLimit(int offset, int limit) {
        return this.projectDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Project> getAllByTeacherId(int teacherId) {
        return this.projectDao.getAllByTeacherId(teacherId);
    }

    @Override
    public List<Project> queryAllByConservator() {
        return this.projectDao.queryAllByConservator();
    }

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    @Override
    public Project insert(Project project) {
        this.projectDao.insert(project);
        List<Project> list = this.projectDao.queryAll(project);
        Project project1 = list.get(list.size()-1);
        return project1;
    }

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    @Override
    public Project update(Project project) {
        this.projectDao.update(project);
        return this.queryById(project.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.projectDao.deleteById(id) > 0;
    }

    @Override
    public List<Project> findSame(int teacherId, String title) {
        return this.projectDao.findSame(teacherId, title);
    }
}