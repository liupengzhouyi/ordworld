package cn.liupengstudy.ordworld.service.impl;

import cn.liupengstudy.ordworld.dao.ProfessionalInformationMapper;
import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.service.ProfessionallninformationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return this.getProfessionalInformationMapper().deleteByPrimaryKey(id);
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

    @Override
    public ProfessionalInformation selectByNumber(String number) {
        return this.getProfessionalInformationMapper().selectByNumber(number);
    }

    @Override
    public List<ProfessionalInformation> getAll() {
        return this.getProfessionalInformationMapper().getAll();
    }

    @Override
    public List<Integer> getAllByCollege(String college) {
        List<ProfessionalInformation> temp = this.professionalInformationMapper.getAllByCollege(college);
        List<Integer> list = new ArrayList<Integer>();
        for (ProfessionalInformation professionalInformation : temp) {
            list.add(new Integer(professionalInformation.getNumber()));
        }
        return list;
    }

    @Override
    public List<Integer> getAllByDepartment(String department) {
        List<ProfessionalInformation> temp = this.professionalInformationMapper.getAllByDepartment(department);
        List<Integer> list = new ArrayList<Integer>();
        for (ProfessionalInformation professionalInformation : temp) {
            list.add(new Integer(professionalInformation.getNumber()));
        }
        return list;
    }

    @Override
    public List<Integer> getAllByProfessional(String professional) {
        List<ProfessionalInformation> temp = this.professionalInformationMapper.getAllByProfessional(professional);
        List<Integer> list = new ArrayList<Integer>();
        for (ProfessionalInformation professionalInformation : temp) {
            list.add(new Integer(professionalInformation.getNumber()));
        }
        return list;
    }
}
