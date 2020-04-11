package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 选题表(Selecttitle)实体类
 *
 * @author makejava
 * @since 2020-04-12 00:39:39
 */
@ApiModel(value = "选题表实体类")
public class Selecttitle implements Serializable {
    private static final long serialVersionUID = -90632013809170077L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 学生ID
    */
    @ApiModelProperty(value = "学生ID")
    private Integer studentid;
    /**
    * 选题ID
    */
    @ApiModelProperty(value = "选题ID")
    private Integer titleid;
    /**
    * 申请日期
    */
    @ApiModelProperty(value = "申请日期")
    private String applicationdata;
    /**
    * 审批日期
    */
    @ApiModelProperty(value = "审批日期")
    private String passdata;
    /**
    * 是否通过
    */
    @ApiModelProperty(value = "是否通过")
    private Integer pass;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getTitleid() {
        return titleid;
    }

    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    public String getApplicationdata() {
        return applicationdata;
    }

    public void setApplicationdata(String applicationdata) {
        this.applicationdata = applicationdata;
    }

    public String getPassdata() {
        return passdata;
    }

    public void setPassdata(String passdata) {
        this.passdata = passdata;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Selecttitle{");
        sb.append("id=").append(id);
        sb.append(", studentid=").append(studentid);
        sb.append(", titleid=").append(titleid);
        sb.append(", applicationdata='").append(applicationdata).append('\'');
        sb.append(", passdata='").append(passdata).append('\'');
        sb.append(", pass=").append(pass);
        sb.append('}');
        return sb.toString();
    }
}