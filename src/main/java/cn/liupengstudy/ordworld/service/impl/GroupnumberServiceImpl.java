package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Groupnumber;
import cn.liupengstudy.ordworld.dao.GroupnumberDao;
import cn.liupengstudy.ordworld.service.GroupnumberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Groupnumber)表服务实现类
 *
 * @author makejava
 * @since 2020-04-12 23:09:29
 */
@Service("groupnumberService")
public class GroupnumberServiceImpl implements GroupnumberService {
    @Resource
    private GroupnumberDao groupnumberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Groupnumber queryById(Integer id) {
        return this.groupnumberDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Groupnumber> queryAllByLimit(int offset, int limit) {
        return this.groupnumberDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Groupnumber> getAllNumber(Groupnumber groupnumber) {
        return this.groupnumberDao.getAllNumber(groupnumber);
    }

    @Override
    public List<Groupnumber> getAllGroup(Groupnumber groupnumber) {
        return this.groupnumberDao.getAllGroup(groupnumber);
    }

    /**
     * 新增数据
     *
     * @param groupnumber 实例对象
     * @return 实例对象
     */
    @Override
    public Groupnumber insert(Groupnumber groupnumber) {
        int key = this.groupnumberDao.insert(groupnumber);
        if (key == 1) {
            List<Groupnumber> list = this.groupnumberDao.queryAll(groupnumber);
            if (list.size() <= 0) {
                groupnumber = null;
            } else {
                groupnumber = list.get(0);
            }
        } else {
            groupnumber = null;
        }
        return groupnumber;
    }

    /**
     * 修改数据
     *
     * @param groupnumber 实例对象
     * @return 实例对象
     */
    @Override
    public Groupnumber update(Groupnumber groupnumber) {
        this.groupnumberDao.update(groupnumber);
        return this.queryById(groupnumber.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.groupnumberDao.deleteById(id) > 0;
    }
}