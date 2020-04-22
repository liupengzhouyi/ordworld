package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Projectfile;
import cn.liupengstudy.ordworld.dao.ProjectfileDao;
import cn.liupengstudy.ordworld.service.ProjectfileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 论文文件表(Projectfile)表服务实现类
 *
 * @author makejava
 * @since 2020-04-22 13:38:26
 */
@Service("projectfileService")
public class ProjectfileServiceImpl implements ProjectfileService {
    @Resource
    private ProjectfileDao projectfileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Projectfile queryById(Integer id) {
        return this.projectfileDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Projectfile> queryAllByLimit(int offset, int limit) {
        return this.projectfileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param projectfile 实例对象
     * @return 实例对象
     */
    @Override
    public Projectfile insert(Projectfile projectfile) {
        this.projectfileDao.insert(projectfile);
        return projectfile;
    }

    /**
     * 修改数据
     *
     * @param projectfile 实例对象
     * @return 实例对象
     */
    @Override
    public Projectfile update(Projectfile projectfile) {
        this.projectfileDao.update(projectfile);
        return this.queryById(projectfile.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.projectfileDao.deleteById(id) > 0;
    }
}