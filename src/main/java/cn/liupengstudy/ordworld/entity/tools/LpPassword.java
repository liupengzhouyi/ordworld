package cn.liupengstudy.ordworld.entity.tools;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import static java.lang.Math.abs;

/**
 * @文件名 cn.liupengstudy.ordworld.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/7 - 11:41 下午
 * @修改人和其它信息
 */
@ApiModel(value = "刘鹏的密码哈希")
public class LpPassword {

    @ApiModelProperty(value = "账号")
    private String number;

    @ApiModelProperty(value = "明文")
    private String password;

    @ApiModelProperty(value = "秘文")
    private int passwordValue;

    public LpPassword(String number, String password) {
        this.number = number;
        this.password = password;
    }

    public LpPassword() {
    }

    public void init() {
        int numberHash = this.getNumber().hashCode();
        int passwordHash = this.getPassword().hashCode();
        int rand = numberHash % 9;
        if (rand == 0) {
            rand = 7;
        }
        this.setPasswordValue(abs(((numberHash + passwordHash) * rand) % 1000000));
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPasswordValue() {
        this.init();
        return passwordValue;
    }

    public void setPasswordValue(int paswordValue) {
        this.passwordValue = paswordValue;
    }

    @Override
    public String toString() {
        return "LpPassword{" +
                "number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", passwordValue=" + passwordValue +
                '}';
    }
}
