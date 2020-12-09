package 结构型设计模式.门面模式.mockStroe.service;

import 结构型设计模式.门面模式.mockStroe.pojo.Gift;

/**
 * @ProjectName: 设计模式
 * @ClassName: PaymentService 支付系统Service，在此需求前已开发完成
 * @Auther: wczy
 * @Date: 2020-12-09 20:57
 * @Version 1.0
 **/
public class PaymentService {

    public boolean pay(Gift gift){
        //是否已支付积分
        System.out.println(gift.getName()+"积分支付成功");
        return true;
    }
}
