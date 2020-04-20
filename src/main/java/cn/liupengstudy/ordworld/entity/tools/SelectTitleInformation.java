package cn.liupengstudy.ordworld.entity.tools;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.entity.Student;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/20 - 3:59 下午
 * @修改人和其它信息
 */
@ApiModel(value = "选题详细信息")
public class SelectTitleInformation {

    @ApiModelProperty(value = "选题信息")
    private Selecttitle selecttitle;

    @ApiModelProperty(value = "学生信息")
    private Student student;

    @ApiModelProperty(value = "题目信息")
    private Project project;

    public SelectTitleInformation() {
    }

    public SelectTitleInformation(Selecttitle selecttitle, Student student, Project project) {
        this.selecttitle = selecttitle;
        this.student = student;
        this.project = project;
    }

    public Selecttitle getSelecttitle() {
        return selecttitle;
    }

    public void setSelecttitle(Selecttitle selecttitle) {
        this.selecttitle = selecttitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SelectTitleInformation{");
        sb.append("selecttitle=").append(selecttitle);
        sb.append(", student=").append(student);
        sb.append(", project=").append(project);
        sb.append('}');
        return sb.toString();
    }
}
