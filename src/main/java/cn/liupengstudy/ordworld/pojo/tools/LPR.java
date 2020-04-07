package cn.liupengstudy.ordworld.pojo.tools;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/7 - 10:33 下午
 * @修改人和其它信息
 */

@ApiModel(value = "通用返回类LPR")
public class LPR {

    @ApiModelProperty(value = "做了什么")
    private String what;

    @ApiModelProperty(value = "是否成功")
    private boolean returnKey;

    @ApiModelProperty(value = "返回对象")
    private Object returnObject;

    public LPR() {
    }

    public LPR(String what, boolean returnKey, Object returnObject) {
        this.what = what;
        this.returnKey = returnKey;
        this.returnObject = returnObject;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public boolean isReturnKey() {
        return returnKey;
    }

    public void setReturnKey(boolean returnKey) {
        this.returnKey = returnKey;
    }

    public Object getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(Object returnObject) {
        this.returnObject = returnObject;
    }

    @Override
    public String toString() {
        return "LPR{" +
                "what='" + what + '\'' +
                ", returnKey=" + returnKey +
                ", returnObject=" + returnObject +
                '}';
    }
}
