package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.mapper.SystemInformationMapper;
import cn.liupengstudy.ordworld.pojo.SystemInformation;
import cn.liupengstudy.ordworld.serviceInterface.SystemInformationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return 0;
    }

    @Override
    public int insert(SystemInformation record) {
        return 0;
    }

    @Override
    public int insertSelective(SystemInformation record) {
        return 0;
    }

    @Override
    public SystemInformation selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SystemInformation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SystemInformation record) {
        return 0;
    }
}
