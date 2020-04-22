package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Projectfile;
import java.util.List;

/**
 * 论文文件表(Projectfile)表服务接口
 *
 * @author makejava
 * @since 2020-04-22 13:38:26
 */
public interface ProjectfileService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Projectfile queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectfile> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param projectfile 实例对象
     * @return 实例对象
     */
    Projectfile insert(Projectfile projectfile);

    /**
     * 修改数据
     *
     * @param projectfile 实例对象
     * @return 实例对象
     */
    Projectfile update(Projectfile projectfile);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}