package cn.liupengstudy.ordworld.service;

import cn.liupengstudy.ordworld.mapper.ProfessionalInformationMapper;
import cn.liupengstudy.ordworld.pojo.ProfessionalInformation;
import cn.liupengstudy.ordworld.serviceInterface.ProfessionallninformationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @文件名 cn.liupengstudy.ordworld.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/8 - 9:08 下午
 * @修改人和其它信息
 */
@Service
public class ProfessionallninformationServiceImpl implements ProfessionallninformationInterface {

    @Autowired
    private ProfessionalInformationMapper professionalInformationMapper;

    public ProfessionalInformationMapper getProfessionalInformationMapper() {
        return professionalInformationMapper;
    }

    public void setProfessionalInformationMapper(ProfessionalInformationMapper professionalInformationMapper) {
        this.professionalInformationMapper = professionalInformationMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ProfessionalInformation record) {
        return this.getProfessionalInformationMapper().insert(record);
    }

    @Override
    public int insertSelective(ProfessionalInformation record) {
        return this.getProfessionalInformationMapper().insert(record);
    }

    @Override
    public ProfessionalInformation selectByPrimaryKey(Integer id) {
        return this.getProfessionalInformationMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProfessionalInformation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProfessionalInformation record) {
        return 0;
    }
}
