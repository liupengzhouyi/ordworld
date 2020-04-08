package cn.liupengstudy.ordworld.pojo.tools;

import cn.liupengstudy.ordworld.entity.tools.LpPassword;
import org.junit.Test;

/**
 * @文件名 cn.liupengstudy.ordworld.pojo.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/8 - 1:40 上午
 * @修改人和其它信息
 */
public class LpPasswordTest {

    @Test
    public void getPasswordValue() {
        LpPassword lpPassword;
        lpPassword = new LpPassword("14747210876", "123456");
        System.out.println(lpPassword.toString());
        int password = lpPassword.getPasswordValue();
        System.out.println(password);
    }
}