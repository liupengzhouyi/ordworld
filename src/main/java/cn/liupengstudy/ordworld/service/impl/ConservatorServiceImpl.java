package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.dao.ConservatorMapper;
import cn.liupengstudy.ordworld.entity.Conservator;
import cn.liupengstudy.ordworld.service.ConservatorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.ordworld.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/7 - 5:47 下午
 * @修改人和其它信息
 */
@Service
public class ConservatorServiceImpl implements ConservatorInterface {

    @Autowired
    private ConservatorMapper conservatorMapper;

    public ConservatorMapper getConservatorMapper() {
        return conservatorMapper;
    }

    public void setConservatorMapper(ConservatorMapper conservatorMapper) {
        this.conservatorMapper = conservatorMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Conservator record) {
        return this.getConservatorMapper().insert(record);
    }

    @Override
    public int insertSelective(Conservator record) {
        return 0;
    }

    @Override
    public Conservator selectByPrimaryKey(Integer id) {
        return this.getConservatorMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Conservator record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Conservator record) {
        return this.getConservatorMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<Conservator> selectByPhoneNumber(String phoneNumber) {
        return this.getConservatorMapper().selectByPhoneNumber(phoneNumber);
    }
}
