package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.dao.SystemInformationMapper;
import cn.liupengstudy.ordworld.entity.SystemInformation;
import cn.liupengstudy.ordworld.service.SystemInformationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.ordworld.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/8 - 2:20 下午
 * @修改人和其它信息
 */
@Service
public class SystemInformationServiceImpl implements SystemInformationInterface {

    @Autowired
    private SystemInformationMapper systemInformationMapper;

    public SystemInformationMapper getSystemInformationMapper() {
        return systemInformationMapper;
    }

    public void setSystemInformationMapper(SystemInformationMapper systemInformationMapper) {
        this.systemInformationMapper = systemInformationMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getSystemInformationMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SystemInformation record) {
        return this.getSystemInformationMapper().insert(record);
    }

    @Override
    public int insertSelective(SystemInformation record) {
        return 0;
    }

    @Override
    public SystemInformation selectByPrimaryKey(Integer id) {
        return this.getSystemInformationMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemInformation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SystemInformation record) {
        return 0;
    }

    @Override
    public List<SystemInformation> getAll() {
        return this.getSystemInformationMapper().getAll();
    }

    @Override
    public List<SystemInformation> selectByAuthor(Integer authorId) {
        return this.getSystemInformationMapper().selectByAuthor(authorId);
    }

    @Override
    public List<SystemInformation> selectByYear(Integer lpyear) {
        return this.getSystemInformationMapper().selectByYear(lpyear);
    }
}
