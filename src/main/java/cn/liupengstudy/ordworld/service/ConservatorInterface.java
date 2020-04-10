package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.entity.Conservator;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.ordworld.serviceInterface
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/7 - 5:46 下午
 * @修改人和其它信息
 */
public interface ConservatorInterface {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 17:41:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 17:41:13 CST 2020
     */
    int insert(Conservator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 17:41:13 CST 2020
     */
    int insertSelective(Conservator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 17:41:13 CST 2020
     */
    Conservator selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 17:41:13 CST 2020
     */
    int updateByPrimaryKeySelective(Conservator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 17:41:13 CST 2020
     */
    int updateByPrimaryKey(Conservator record);

    List<Conservator> selectByPhoneNumber(String phoneNumber);
}