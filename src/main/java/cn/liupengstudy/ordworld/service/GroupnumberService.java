package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Groupnumber;
import java.util.List;

/**
 * (Groupnumber)表服务接口
 *
 * @author makejava
 * @since 2020-04-12 23:09:29
 */
public interface GroupnumberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Groupnumber queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Groupnumber> queryAllByLimit(int offset, int limit);

    List<Groupnumber> getAllNumber(Groupnumber groupnumber);

    List<Groupnumber> getAllGroup(Groupnumber groupnumber);

    /**
     * 新增数据
     *
     * @param groupnumber 实例对象
     * @return 实例对象
     */
    Groupnumber insert(Groupnumber groupnumber);

    /**
     * 修改数据
     *
     * @param groupnumber 实例对象
     * @return 实例对象
     */
    Groupnumber update(Groupnumber groupnumber);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}