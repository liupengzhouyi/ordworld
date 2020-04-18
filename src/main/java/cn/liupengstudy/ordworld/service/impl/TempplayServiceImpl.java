/*
package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Tempplay;
import cn.liupengstudy.ordworld.dao.TempplayDao;
import cn.liupengstudy.ordworld.service.TempplayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

*/
/**
 * (Tempplay)表服务实现类
 *
 * @author makejava
 * @since 2020-04-18 16:43:23
 *//*

@Service("tempplayService")
public class TempplayServiceImpl implements TempplayService {
    @Resource
    private TempplayDao tempplayDao;

    */
/**
     * 通过ID查询单条数据
     *
     * @param thisid 主键
     * @return 实例对象
     *//*

    @Override
    public Tempplay queryById(Integer thisid) {
        return this.tempplayDao.queryById(thisid);
    }

    */
/**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     *//*

    @Override
    public List<Tempplay> queryAllByLimit(int offset, int limit) {
        return this.tempplayDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Tempplay> getAll() {
        return this.tempplayDao.getAll();
    }

    */
/**
     * 新增数据
     *
     * @param tempplay 实例对象
     * @return 实例对象
     *//*

    @Override
    public Tempplay insert(Tempplay tempplay) {
        this.tempplayDao.insert(tempplay);
        return tempplay;
    }

    */
/**
     * 修改数据
     *
     * @param tempplay 实例对象
     * @return 实例对象
     *//*

    @Override
    public Tempplay update(Tempplay tempplay) {
        this.tempplayDao.update(tempplay);
        return this.queryById(tempplay.getThisid());
    }

    */
/**
     * 通过主键删除数据
     *
     * @param thisid 主键
     * @return 是否成功
     *//*

    @Override
    public boolean deleteById(Integer thisid) {
        return this.tempplayDao.deleteById(thisid) > 0;
    }
}*/
