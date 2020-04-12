package cn.liupengstudy.ordworld.entity;

import java.io.Serializable;

/**
 * 讨论组表(Group)实体类
 *
 * @author makejava
 * @since 2020-04-12 21:29:32
 */
public class Group implements Serializable {
    private static final long serialVersionUID = 315472822005789716L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 教师ID
    */
    private Integer teacherid;
    /**
    * 图片
    */
    private String imageurl;
    /**
    * 小组名称
    */
    private String name;


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

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}