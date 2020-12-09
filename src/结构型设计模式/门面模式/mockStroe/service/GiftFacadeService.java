package 结构型设计模式.门面模式.mockStroe.service;

import 结构型设计模式.门面模式.mockStroe.pojo.Gift;

/**
 * @ProjectName: 设计模式
 * @ClassName: GiftFacadeService  兑换礼物系统，为了完成需求，直接对接之前已开发的子系统
 * @Auther: wczy
 * @Date: 2020-12-09 21:03
 * @Version 1.0
 **/
public class GiftFacadeService {

    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    //对外开放兑换礼物的exchange()方法
    public void exchange(Gift gift){
        //校验礼品兑换资格
        if (qualifyService.isAvailable(gift)){
            //校验是否支付积分
            if (paymentService.pay(gift)){
                String orderId = shippingService.delivery(gift);
                System.out.println("下单成功，单号为："+orderId);
            }
        }
    }
}
