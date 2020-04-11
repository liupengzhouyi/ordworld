package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 学生表(Student)实体类
 *
 * @author makejava
 * @since 2020-04-11 22:14:01
 */
@ApiModel(value = "学生表")
public class Student implements Serializable {
    private static final long serialVersionUID = -40380041120908034L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 学生学号
    */
    @ApiModelProperty(value = "学生学号")
    private String studentid;
    /**
    * 密码值
    */
    @ApiModelProperty(value = "密码值")
    private Integer password;
    /**
    * 头像图片
    */
    @ApiModelProperty(value = "头像图片")
    private String imageurl;
    /**
    * 专业编号
    */
    @ApiModelProperty(value = "专业编号")
    private Integer prodessionalid;
    /**
    * 联系方式
    */
    @ApiModelProperty(value = "联系方式")
    private String phonenumber;
    /**
    * 删除标记
    */
    @ApiModelProperty(value = "删除标记")
    private Integer isdelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getProdessionalid() {
        return prodessionalid;
    }

    public void setProdessionalid(Integer prodessionalid) {
        this.prodessionalid = prodessionalid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", studentid='").append(studentid).append('\'');
        sb.append(", password=").append(password);
        sb.append(", imageurl='").append(imageurl).append('\'');
        sb.append(", prodessionalid=").append(prodessionalid);
        sb.append(", phonenumber='").append(phonenumber).append('\'');
        sb.append(", isdelete=").append(isdelete);
        sb.append('}');
        return sb.toString();
    }
}