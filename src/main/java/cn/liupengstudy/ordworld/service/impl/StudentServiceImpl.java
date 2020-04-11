package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.dao.StudentDao;
import cn.liupengstudy.ordworld.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生表(Student)表服务实现类
 *
 * @author makejava
 * @since 2020-04-11 22:14:01
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer id) {
        return this.studentDao.queryById(id);
    }

    @Override
    public Student queryByStudentNumber(String studentID) {
        return this.studentDao.queryByStudentNumber(studentID);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return this.studentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        int key = this.studentDao.insert(student);
        if (key == 1) {
            student = this.queryByStudentNumber(student.getStudentid());
        } else {
            student = null;
        }
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.studentDao.deleteById(id) > 0;
    }
}