package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.mapper.ConservatorMapper;
import cn.liupengstudy.ordworld.pojo.Conservator;
import cn.liupengstudy.ordworld.serviceInterface.ConservatorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Conservator record) {
        return 0;
    }

    @Override
    public int insertSelective(Conservator record) {
        return 0;
    }

    @Override
    public Conservator selectByPrimaryKey(Integer id) {
        return this.conservatorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Conservator record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Conservator record) {
        return 0;
    }
}
