package cn.liupengstudy.ordworld.entity.tools;

import cn.liupengstudy.ordworld.entity.Student;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/11 - 11:10 下午
 * @修改人和其它信息
 */
@ApiModel(value = "学生注册登陆修改密码类")
public class ReStudent {

    @ApiModelProperty(value = "学生信息")
    private Student student;

    @ApiModelProperty(value = "登陆密码")
    private String password;

    @ApiModelProperty(value = "密码")
    private String password1;

    @ApiModelProperty(value = "确认密码")
    private String password2;

    public ReStudent() {
    }

    public ReStudent(Student student, String password, String password1, String password2) {
        this.student = student;
        this.password = password;
        this.password1 = password1;
        this.password2 = password2;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReStudent{");
        sb.append("student=").append(student);
        sb.append(", password='").append(password).append('\'');
        sb.append(", password1='").append(password1).append('\'');
        sb.append(", password2='").append(password2).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
