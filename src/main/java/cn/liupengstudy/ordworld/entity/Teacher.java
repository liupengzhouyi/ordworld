package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;

/**
 * 教师(Teacher)实体类
 *
 * @author makejava
 * @since 2020-04-08 23:14:41
 */
@ApiModel(value = "教师")
public class Teacher implements Serializable {

    private static final long serialVersionUID = -23462057810422623L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 头像URL
    */
    @ApiModelProperty(value = "头像URL")
    private String imageurl;
    /**
    * 教师编号
    */
    @ApiModelProperty(value = "教师编号")
    private String teachernumber;
    /**
    * 密码
    */
    @ApiModelProperty(value = "密码")
    private Integer password;
    /**
    * 联系方式
    */
    @ApiModelProperty(value = "联系方式")
    private String phonenumber;
    /**
    * 专业编号
    */
    @ApiModelProperty(value = "专业编号")
    private String professionalid;
    /**
    * 是否注销
    */
    @ApiModelProperty(value = "是否注销")
    private Integer isdelete;
    /**
    * 教师名称
    */
    @ApiModelProperty(value = "教师名称")
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTeachernumber() {
        return teachernumber;
    }

    public void setTeachernumber(String teachernumber) {
        this.teachernumber = teachernumber;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(String professionalid) {
        this.professionalid = professionalid;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Teacher{");
        sb.append("id=").append(id);
        sb.append(", imageurl='").append(imageurl).append('\'');
        sb.append(", teachernumber='").append(teachernumber).append('\'');
        sb.append(", password=").append(password);
        sb.append(", phonenumber='").append(phonenumber).append('\'');
        sb.append(", professionalid='").append(professionalid).append('\'');
        sb.append(", isdelete=").append(isdelete);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}