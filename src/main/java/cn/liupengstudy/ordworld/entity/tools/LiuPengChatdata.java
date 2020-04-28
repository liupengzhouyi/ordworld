package cn.liupengstudy.ordworld.entity.tools;

import cn.liupengstudy.ordworld.entity.Chat;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.Teacher;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/28 - 9:16 下午
 * @修改人和其它信息
 */
@ApiModel(value = "聊天信息数据")
public class LiuPengChatdata {

    @ApiModelProperty(value = "发言人类型")
    private Integer autorchType;

    @ApiModelProperty(value = "学生数据")
    private Student student;

    @ApiModelProperty(value = "教师数据")
    private Teacher teacher;

    @ApiModelProperty(value = "发言数据")
    private Chat chat;

    public LiuPengChatdata() {
    }

    public LiuPengChatdata(Integer autorchType, Student student, Teacher teacher, Chat chat) {
        this.autorchType = autorchType;
        this.student = student;
        this.teacher = teacher;
        this.chat = chat;
    }

    public Integer getAutorchType() {
        return autorchType;
    }

    public void setAutorchType(Integer autorchType) {
        this.autorchType = autorchType;
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

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LiuPengChatdata{");
        sb.append("autorchType=").append(autorchType);
        sb.append(", student=").append(student);
        sb.append(", teacher=").append(teacher);
        sb.append(", chat=").append(chat);
        sb.append('}');
        return sb.toString();
    }
}
