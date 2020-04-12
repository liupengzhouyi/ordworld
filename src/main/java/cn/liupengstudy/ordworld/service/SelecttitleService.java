package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Selecttitle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 选题表(Selecttitle)表服务接口
 *
 * @author makejava
 * @since 2020-04-12 00:39:39
 */
public interface SelecttitleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Selecttitle queryById(Integer id);

    Selecttitle queryRepeat(@Param("studentid") int studentid, @Param("titleid") int titleid, @Param("pass") int pass);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Selecttitle> queryAllByLimit(int offset, int limit);

    List<Selecttitle> queryAllByStudentID(@Param("studentid") int studentid);

    List<Selecttitle> queryAllByTitleID(@Param("titleid") int titleid);

    /**
     * 新增数据
     *
     * @param selecttitle 实例对象
     * @return 实例对象
     */
    Selecttitle insert(Selecttitle selecttitle);

    /**
     * 修改数据
     *
     * @param selecttitle 实例对象
     * @return 实例对象
     */
    Selecttitle update(Selecttitle selecttitle);

    Selecttitle passApplication(@Param("id") int id, @Param("pass") int pass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}