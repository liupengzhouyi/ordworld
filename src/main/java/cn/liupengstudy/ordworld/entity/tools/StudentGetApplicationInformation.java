package cn.liupengstudy.ordworld.entity.tools;

import cn.liupengstudy.ordworld.entity.Project;
import cn.liupengstudy.ordworld.entity.Selecttitle;
import cn.liupengstudy.ordworld.entity.Teacher;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/20 - 10:33 下午
 * @修改人和其它信息
 */
@ApiModel(value = "学生查询自己的申请信息")
public class StudentGetApplicationInformation {

    @ApiModelProperty(value = "选题信息")
    private Selecttitle selecttitle;

    @ApiModelProperty(value = "题目信息s")
    private Project project;

    @ApiModelProperty(value = "教师信息")
    private Teacher teacher;

    public StudentGetApplicationInformation() {
    }

    public StudentGetApplicationInformation(Selecttitle selecttitle, Project project, Teacher teacher) {
        this.selecttitle = selecttitle;
        this.project = project;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentGetApplicationInformation{");
        sb.append("selecttitle=").append(selecttitle);
        sb.append(", project=").append(project);
        sb.append(", teacher=").append(teacher);
        sb.append('}');
        return sb.toString();
    }
}
