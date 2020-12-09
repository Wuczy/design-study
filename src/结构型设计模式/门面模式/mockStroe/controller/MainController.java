package 结构型设计模式.门面模式.mockStroe.controller;

import 结构型设计模式.门面模式.mockStroe.pojo.Gift;
import 结构型设计模式.门面模式.mockStroe.service.GiftFacadeService;

/**
 * @ProjectName: 设计模式
 * @ClassName: MainController
 * @Auther: wczy
 * @Date: 2020-12-09 21:09
 * @Version 1.0
 **/
public class MainController {
    private GiftFacadeService giftFacadeService = new GiftFacadeService();

    //对外开放礼品兑换接口
    public void getGift(Gift gift){
        giftFacadeService.exchange(gift);
    }
}
