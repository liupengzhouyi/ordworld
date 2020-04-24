package cn.liupengstudy.ordworld.entity.tools;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.Teacher;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/25 - 12:39 上午
 * @修改人和其它信息
 */
@ApiModel(value = "我的选题信息")
public class MyTitleInformation {

    @ApiModelProperty(value = "学生信息")
    private Student student;

    @ApiModelProperty(value = "教师信息")
    private Teacher teacher;

    @ApiModelProperty(value = "选题信息")
    private Selecttitle selecttitle;

    @ApiModelProperty(value = "题目信息")
    private Project project;

    public MyTitleInformation() {
    }

    public MyTitleInformation(Student student, Teacher teacher, Selecttitle selecttitle, Project project) {
        this.student = student;
        this.teacher = teacher;
        this.selecttitle = selecttitle;
        this.project = project;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Selecttitle getSelecttitle() {
        return selecttitle;
    }

    public void setSelecttitle(Selecttitle selecttitle) {
        this.selecttitle = selecttitle;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyTitleInformation{");
        sb.append("student=").append(student);
        sb.append(", teacher=").append(teacher);
        sb.append(", selecttitle=").append(selecttitle);
        sb.append(", project=").append(project);
        sb.append('}');
        return sb.toString();
    }
}
