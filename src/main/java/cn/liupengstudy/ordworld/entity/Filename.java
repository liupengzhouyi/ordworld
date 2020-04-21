package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 文件名表(Filename)实体类
 *
 * @author makejava
 * @since 2020-04-16 22:25:18
 */
@ApiModel(value = "文件名表(Filename)实体类")
public class Filename implements Serializable {
    private static final long serialVersionUID = -33765011313090763L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 文件名称
    */
    @ApiModelProperty(value = "文件名称")
    private String filename;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Filename{");
        sb.append("id=").append(id);
        sb.append(", filename='").append(filename).append('\'');
        sb.append('}');
        return sb.toString();
    }
}