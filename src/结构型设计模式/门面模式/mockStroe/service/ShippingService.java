package 结构型设计模式.门面模式.mockStroe.service;

import 结构型设计模式.门面模式.mockStroe.pojo.Gift;

/**
 * @ProjectName: 设计模式
 * @ClassName: ShippingService  物流系统，在此需求前已开发完成
 * @Auther: wczy
 * @Date: 2020-12-09 21:00
 * @Version 1.0
 **/
public class ShippingService {

    public String delivery(Gift gift){
        //礼品是否已进入物流系统
        System.out.println(gift.getName()+"已成功进入物流系统");
        //返回单号
        return "9527";
    }
}
