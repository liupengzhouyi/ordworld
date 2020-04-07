package cn.liupengstudy.ordworld.pojo.tools;

import cn.liupengstudy.ordworld.pojo.Conservator;

/**
 * @文件名 cn.liupengstudy.ordworld.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/8 - 2:17 上午
 * @修改人和其它信息
 */
public class ReConservator {

    private Conservator conservator;

    private String password;

    public ReConservator(Conservator conservator, String password) {
        this.conservator = conservator;
        this.password = password;
    }

    public ReConservator() {
    }

    public Conservator getConservator() {
        return conservator;
    }

    public void setConservator(Conservator conservator) {
        this.conservator = conservator;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ReConservator{" +
                "conservator=" + conservator +
                ", password='" + password + '\'' +
                '}';
    }
}
