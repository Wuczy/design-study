package 结构型设计模式.门面模式.mockStroe.service;

import 结构型设计模式.门面模式.mockStroe.pojo.Gift;

/**
 * @ProjectName: 设计模式
 * @ClassName: QualifyService  积分系统Service，在此需求前已开发完成
 * @Auther: wczy
 * @Date: 2020-12-09 20:54
 * @Version 1.0
 **/
public class QualifyService {

    public Boolean isAvailable(Gift gift){
        //是否可以通过积分兑换，库存是否充足
        System.out.println(gift.getName()+"可通过积分兑换，且库存充足");
        return true;
    }
}
