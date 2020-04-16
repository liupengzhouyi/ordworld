package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Filename;
import java.util.List;

/**
 * 文件名表(Filename)表服务接口
 *
 * @author makejava
 * @since 2020-04-16 22:25:18
 */
public interface FilenameService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Filename queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Filename> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param filename 实例对象
     * @return 实例对象
     */
    Filename insert(Filename filename);

    /**
     * 修改数据
     *
     * @param filename 实例对象
     * @return 实例对象
     */
    Filename update(Filename filename);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}