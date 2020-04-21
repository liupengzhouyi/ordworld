package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (Groupnumber)实体类
 *
 * @author makejava
 * @since 2020-04-12 23:09:29
 */
@ApiModel(value = "小组成员模型")
public class Groupnumber implements Serializable {
    private static final long serialVersionUID = 166166637052357717L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 小组ID
    */
    @ApiModelProperty(value = "小组ID")
    private Integer groupid;
    /**
    * 学生ID
    */
    @ApiModelProperty(value = "学生ID")
    private Integer studentid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

}