package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.dao.SelecttitleDao;
import cn.liupengstudy.ordworld.service.SelecttitleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 选题表(Selecttitle)表服务实现类
 *
 * @author makejava
 * @since 2020-04-12 00:39:39
 */
@Service("selecttitleService")
public class SelecttitleServiceImpl implements SelecttitleService {
    @Resource
    private SelecttitleDao selecttitleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Selecttitle queryById(Integer id) {
        return this.selecttitleDao.queryById(id);
    }

    @Override
    public Selecttitle queryRepeat(int studentid, int titleid, int pass) {
        return this.selecttitleDao.queryRepeat(studentid, titleid, pass);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Selecttitle> queryAllByLimit(int offset, int limit) {
        return this.selecttitleDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Selecttitle> queryAllByStudentID(int studentid) {
        return this.selecttitleDao.queryAllByStudentID(studentid);
    }

    /**
     * 新增数据
     *
     * @param selecttitle 实例对象
     * @return 实例对象
     */
    @Override
    public Selecttitle insert(Selecttitle selecttitle) {
        int key = this.selecttitleDao.insert(selecttitle);
        if (key != 1) {
            selecttitle = null;
        } else {
            List<Selecttitle> list = this.selecttitleDao.queryAll(selecttitle);
            if (list.size() >= 1) {
                selecttitle = list.get(0);
            } else {
                selecttitle = null;
            }
        }
        return selecttitle;
    }

    /**
     * 修改数据
     *
     * @param selecttitle 实例对象
     * @return 实例对象
     */
    @Override
    public Selecttitle update(Selecttitle selecttitle) {
        this.selecttitleDao.update(selecttitle);
        return this.queryById(selecttitle.getId());
    }

    @Override
    public Selecttitle passApplication(int id, int pass) {
        this.selecttitleDao.passApplication(id, pass);
        return this.queryById(id);

    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.selecttitleDao.deleteById(id) > 0;
    }
}