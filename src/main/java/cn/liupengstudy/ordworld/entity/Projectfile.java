package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.io.Serializable;

/**
 * 论文文件表(Projectfile)实体类
 *
 * @author makejava
 * @since 2020-04-22 21:00:29
 */
@ApiModel(value = "论文文件表")
public class Projectfile implements Serializable {
    private static final long serialVersionUID = 710267406844392638L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 题目ID
    */
    @ApiModelProperty(value = "题目ID")
    private Integer titleid;
    /**
    * 教师编号
    */
    @ApiModelProperty(value = "教师编号")
    private String teachernumber;
    /**
    * 学生学号
    */
    @ApiModelProperty(value = "学生学号")
    private String studentnumber;
    /**
    * 文件描述名称
    */
    @ApiModelProperty(value = "文件描述名称")
    private String name;
    /**
    * 文件描述
    */
    @ApiModelProperty(value = "文件描述")
    private String introduction;
    /**
    * 文件下载地址
    */
    @ApiModelProperty(value = "文件下载地址")
    private String fileurl;
    /**
    * 上传日期
    */
    @ApiModelProperty(value = "上传日期")
    private String upladdata;
    /**
    * 是否有效
    */
    @ApiModelProperty(value = "是否有效")
    private Integer versionkey;
    /**
    * 版本
    */
    @ApiModelProperty(value = "版本")
    private String version;
    /**
    * 教师批复时间
    */
    @ApiModelProperty(value = "教师批复时间")
    private String approvaldata;
    /**
    * 教师批复内容
    */
    @ApiModelProperty(value = "教师批复内容")
    private String approval;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTitleid() {
        return titleid;
    }

    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    public String getTeachernumber() {
        return teachernumber;
    }

    public void setTeachernumber(String teachernumber) {
        this.teachernumber = teachernumber;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getUpladdata() {
        return upladdata;
    }

    public void setUpladdata(String upladdata) {
        this.upladdata = upladdata;
    }

    public Integer getVersionkey() {
        return versionkey;
    }

    public void setVersionkey(Integer versionkey) {
        this.versionkey = versionkey;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApprovaldata() {
        return approvaldata;
    }

    public void setApprovaldata(String approvaldata) {
        this.approvaldata = approvaldata;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

}