package cn.liupengstudy.ordworld.entity.tools;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Mapper;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/22 - 9:13 下午
 * @修改人和其它信息
 */
@ApiModel(value = "版本控制器模型")
public class LiuPengVersion {

    @ApiModelProperty(value = "版本")
    private String stringVersion;

    public LiuPengVersion(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    public LiuPengVersion() {
        this.stringVersion = "V 1.0";
    }

    public void add() {
        String number = this.stringVersion.substring(2);
        double doubleNumber = Double.parseDouble(number);
        doubleNumber = (doubleNumber * 10 + 1) / 10;
        this.setStringVersion("V " + doubleNumber);
    }

    public String getStringVersion() {
        return stringVersion;
    }

    public void setStringVersion(String stringVersion) {
        this.stringVersion = stringVersion;
    }
}
