package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 毕设题目(Project)实体类
 *
 * @author makejava
 * @since 2020-04-09 19:16:54
 */
@ApiModel(value = "毕设题目")
public class Project implements Serializable {
    private static final long serialVersionUID = 412749723909284536L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 教师ID
    */
    @ApiModelProperty(value = "教师ID")
    private Integer teacherid;
    /**
    * 题目
    */
    @ApiModelProperty(value = "题目")
    private String title;
    /**
    * 描述文件
    */
    @ApiModelProperty(value = "描述文件")
    private String fileurl;
    /**
    * 是否被选
    */
    @ApiModelProperty(value = "是否被选")
    private Integer isselect;
    /**
    * 学生学号
    */
    @ApiModelProperty(value = "学生学号")
    private String studentnumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public Integer getIsselect() {
        return isselect;
    }

    public void setIsselect(Integer isselect) {
        this.isselect = isselect;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Project{");
        sb.append("id=").append(id);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", title='").append(title).append('\'');
        sb.append(", fileurl='").append(fileurl).append('\'');
        sb.append(", isselect=").append(isselect);
        sb.append(", studentnumber='").append(studentnumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}