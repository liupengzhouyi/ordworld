/*
package cn.liupengstudy.ordworld.controller;

import cn.liupengstudy.ordworld.entity.ProfessionalInformation;
import cn.liupengstudy.ordworld.entity.Teacher;
import cn.liupengstudy.ordworld.entity.Tempplay;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import cn.liupengstudy.ordworld.service.TempplayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

*/
/**
 * (Tempplay)表控制层
 *
 * @author makejava
 * @since 2020-04-18 16:43:24
 *//*

@RestController
@RequestMapping("tempplay")
public class TempplayController {
    */
/**
     * 服务对象
     *//*

    @Resource
    private TempplayService tempplayService;

    @Autowired
    private ProfessionallninformationController professionallninformationController;

    */
/**
     * 通过主键查询单条数据
     *//*

    @ApiOperation(value = "电话号码查重")
    @RequestMapping(path = "/pp", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public void findSamePhoneNumber() {
        List<Tempplay> list = this.tempplayService.getAll();
        String key = "化学工程与工艺";
        for (int i=0;i<list.size();i++) {

            Tempplay temp = list.get(i);

            // System.out.println(temp.toString());
            Tempplay tempplay = temp;

            ProfessionalInformation professionalInformation = new ProfessionalInformation();

            professionalInformation.setCollege(tempplay.getPalyone());
            professionalInformation.setDepartment("-");
            professionalInformation.setProfessional(tempplay.getPalytow());
            professionalInformation.setNumber(tempplay.getPalythree());
            System.out.println(professionalInformation.toString());
            this.professionallninformationController.add(professionalInformation);

            // update
            */
/*tempplay.setThisid(temp.getThisid());
            tempplay.setPalyone(temp.getPalyone().replace(" ", ""));
            tempplay.setPalytow(temp.getPalytow().replace(" ", ""));
            tempplay.setPalythree(temp.getPalythree().replace(" ", ""));
            this.tempplayService.update(tempplay);
            if (tempplay.getPalythree().length() > 6) {
                tempplay.setPalythree(tempplay.getPalythree().substring(4,9));
            }
            System.out.print('.');
            if (i < list.size() - 1) {
                Tempplay tempplay1 = list.get(i + 1);
                if (tempplay1.getPalytow().equals(key)) {
                    this.tempplayService.deleteById(tempplay.getThisid());
                } else {
                    System.out.println();
                    System.out.println(tempplay.toString());
                    this.tempplayService.update(tempplay);
                    key = tempplay1.getPalytow();
                }
            } else {
                this.tempplayService.update(tempplay);
            }*//*

        }
    }

}*/
