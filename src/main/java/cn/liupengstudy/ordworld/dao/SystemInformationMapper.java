package cn.liupengstudy.ordworld.dao;

import cn.liupengstudy.ordworld.entity.SystemInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemInformation
     *
     * @mbg.generated Wed Apr 08 14:01:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemInformation
     *
     * @mbg.generated Wed Apr 08 14:01:03 CST 2020
     */
    int insert(SystemInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemInformation
     *
     * @mbg.generated Wed Apr 08 14:01:03 CST 2020
     */
    int insertSelective(SystemInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemInformation
     *
     * @mbg.generated Wed Apr 08 14:01:03 CST 2020
     */
    SystemInformation selectByPrimaryKey(Integer id);

    List<SystemInformation> getAll();

    List<SystemInformation> selectByAuthor(Integer authorId);

    List<SystemInformation> selectByYear(Integer lpyear);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemInformation
     *
     * @mbg.generated Wed Apr 08 14:01:03 CST 2020
     */
    int updateByPrimaryKeySelective(SystemInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemInformation
     *
     * @mbg.generated Wed Apr 08 14:01:03 CST 2020
     */
    int updateByPrimaryKey(SystemInformation record);
}