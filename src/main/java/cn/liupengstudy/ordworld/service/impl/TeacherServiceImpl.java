package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Teacher;
import cn.liupengstudy.ordworld.dao.TeacherDao;
import cn.liupengstudy.ordworld.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 教师(Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-04-08 23:14:41
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer id) {
        return this.teacherDao.queryById(id);
    }


    @Override
    public Teacher selectByNumber(String teacherNumber) {
        return this.teacherDao.selectByNumber(teacherNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryAllByLimit(int offset, int limit) {
        return this.teacherDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Teacher> findByPhoneNimber(String phoneNumber) {
        return this.teacherDao.findByPhoneNimber(phoneNumber);
    }

    @Override
    public List<Teacher> getAll() {
        return this.teacherDao.getAll();
    }

    @Override
    public List<Teacher> getByProfessional(String professionalid) {
        return this.teacherDao.getByProfessional(professionalid);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        Teacher teacher1 = null;
        int key = this.teacherDao.insert(teacher);
        if (key == 1) {
            teacher1 = this.selectByNumber(teacher.getTeachernumber());
        }
        return teacher1;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getId());
    }

    @Override
    public int rePassword(Integer id, Integer password) {
        return this.teacherDao.rePassword(id, password);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.teacherDao.deleteById(id) > 0;
    }
}