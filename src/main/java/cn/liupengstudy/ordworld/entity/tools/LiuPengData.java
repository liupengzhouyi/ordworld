package cn.liupengstudy.ordworld.entity.tools;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/19 - 10:08 下午
 * @修改人和其它信息
 */
@ApiModel(value = "时间格式")
public class LiuPengData {

    private String year;
    private String month;
    private String day;
    private String hours;
    private String minutes;
    private String seconds;

    @ApiModelProperty(value = "字符串时间")
    private String lpData;

    public LiuPengData() {
        this.init();
    }

    public void init() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date date = new Date();
        String string = dateFormat.format(date);
        String[] strings = string.split("-");
        System.out.println(strings.length);
        if (strings.length == 6){
            this.lpData = strings[0] + "-" + strings[1] + "-" + strings[2] + " " + strings[3] + ":" + strings[4] + ":" + strings[5];
        } else {
            this.lpData = "2020-04-19 22:18:14";
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getLpData() {
        return lpData;
    }

    public void setLpData(String lpData) {
        this.lpData = lpData;
    }
}
