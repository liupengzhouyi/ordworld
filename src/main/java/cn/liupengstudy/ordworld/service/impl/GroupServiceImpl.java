package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Group;
import cn.liupengstudy.ordworld.dao.GroupDao;
import cn.liupengstudy.ordworld.service.GroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 讨论组表(Group)表服务实现类
 *
 * @author makejava
 * @since 2020-04-12 21:29:32
 */
@Service("groupService")
public class GroupServiceImpl implements GroupService {
    @Resource
    private GroupDao groupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Group queryById(Integer id) {
        return this.groupDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Group> queryAllByLimit(int offset, int limit) {
        return this.groupDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Group> getAllByTeacherId(int teacherid) {
        return this.groupDao.getAllByTeacherId(teacherid);
    }

    @Override
    public List<Group> getAll() {
        return this.groupDao.getAll();
    }

    /**
     * 新增数据
     *
     * @param group 实例对象
     * @return 实例对象
     */
    @Override
    public Group insert(Group group) {
        int key = this.groupDao.insert(group);
        if (key == 1) {
            List<Group> list = this.groupDao.queryAll(group);
            if (list.size() <= 0) {
                group = null;
            } else {
                group = list.get(0);
            }
        } else {
            group = null;
        }
        return group;
    }

    /**
     * 修改数据
     *
     * @param group 实例对象
     * @return 实例对象
     */
    @Override
    public Group update(Group group) {
        this.groupDao.update(group);
        return this.queryById(group.getId());
    }

    @Override
    public Group reName(int id, String name) {
        Group group = new Group();
        group.setId(id);
        group.setName(name);
        this.groupDao.reName(group);
        return this.queryById(group.getId());
    }

    @Override
    public Group reImage(Group group) {
        this.groupDao.update(group);
        return this.queryById(group.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.groupDao.deleteById(id) > 0;
    }
}