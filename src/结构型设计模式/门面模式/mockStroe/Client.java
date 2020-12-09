package 结构型设计模式.门面模式.mockStroe;

import 结构型设计模式.门面模式.mockStroe.controller.MainController;
import 结构型设计模式.门面模式.mockStroe.pojo.Gift;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client
 * @Auther: wczy
 * @Date: 2020-12-09 21:12
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Gift gift = new Gift("Orange Code");
        MainController controller = new MainController();
        controller.getGift(gift);
    }
}
