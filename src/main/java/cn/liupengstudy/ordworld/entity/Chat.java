package cn.liupengstudy.ordworld.entity;

import java.io.Serializable;

/**
 * 聊天信息表(Chat)实体类
 *
 * @author makejava
 * @since 2020-04-12 23:37:15
 */
public class Chat implements Serializable {
    private static final long serialVersionUID = -44745307239399526L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 小组ID
    */
    private Integer groupid;
    /**
    * 发言人类型
    */
    private Integer type;
    /**
    * 作者ID
    */
    private Integer authorid;
    /**
    * 聊天信息
    */
    private String information;
    /**
    * 年
    */
    private Integer year;
    /**
    * 月
    */
    private Integer month;
    /**
    * 日
    */
    private Integer day;
    /**
    * 小时
    */
    private Integer hour;
    /**
    * 分钟
    */
    private Integer moment;
    /**
    * 秒
    */
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

}