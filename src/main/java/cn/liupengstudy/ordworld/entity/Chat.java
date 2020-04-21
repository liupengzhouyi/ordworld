package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 聊天信息表(Chat)实体类
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */
@ApiModel(value = "聊天信息")
public class Chat implements Serializable {
    private static final long serialVersionUID = -44745307239399526L;
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
    * 发言人类型
    */
    @ApiModelProperty(value = "发言人类型")
    private Integer type;
    /**
    * 作者ID
    */
    @ApiModelProperty(value = "作者ID")
    private Integer authorid;
    /**
    * 聊天信息
    */
    @ApiModelProperty(value = "聊天信息")
    private String information;
    /**
    * 年
    */
    @ApiModelProperty(value = "年")
    private Integer year;
    /**
    * 月
    */
    @ApiModelProperty(value = "月")
    private Integer month;
    /**
    * 日
    */
    @ApiModelProperty(value = "日")
    private Integer day;
    /**
    * 小时
    */
    @ApiModelProperty(value = "小时")
    private Integer hour;
    /**
    * 分钟
    */
    @ApiModelProperty(value = "分钟")
    private Integer moment;
    /**
    * 秒
    */
    @ApiModelProperty(value = "秒")
    private Integer second;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMoment() {
        return moment;
    }

    public void setMoment(Integer moment) {
        this.moment = moment;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chat{");
        sb.append("id=").append(id);
        sb.append(", groupid=").append(groupid);
        sb.append(", type=").append(type);
        sb.append(", authorid=").append(authorid);
        sb.append(", information='").append(information).append('\'');
        sb.append(", year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", day=").append(day);
        sb.append(", hour=").append(hour);
        sb.append(", moment=").append(moment);
        sb.append(", second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}