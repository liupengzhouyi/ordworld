package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Filename;
import cn.liupengstudy.ordworld.dao.FilenameDao;
import cn.liupengstudy.ordworld.service.FilenameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件名表(Filename)表服务实现类
 *
 * @author makejava
 * @since 2020-04-16 22:25:18
 */
@Service("filenameService")
public class FilenameServiceImpl implements FilenameService {
    @Resource
    private FilenameDao filenameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Filename queryById(Integer id) {
        return this.filenameDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Filename> queryAllByLimit(int offset, int limit) {
        return this.filenameDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param filename 实例对象
     * @return 实例对象
     */
    @Override
    public Filename insert(Filename filename) {
        this.filenameDao.insert(filename);
        return filename;
    }

    /**
     * 修改数据
     *
     * @param filename 实例对象
     * @return 实例对象
     */
    @Override
    public Filename update(Filename filename) {
        this.filenameDao.update(filename);
        return this.queryById(filename.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.filenameDao.deleteById(id) > 0;
    }
}