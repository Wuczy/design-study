package 创建型设计模式.工厂模式.demo.factory.factoryMethod;

import 创建型设计模式.工厂模式.demo.pojo.BJCheesePizza;
import 创建型设计模式.工厂模式.demo.pojo.BJPepperPizza;
import 创建型设计模式.工厂模式.demo.pojo.Pizza;

/**
 * @ProjectName: 设计模式
 * @ClassName: BJOrderPizza
 * @Auther: wczy
 * @Date: 2020-11-30 15:34
 * @Version 1.0
 **/
public class BJOrderPizza implements OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType != null && !"".equals(orderType.trim())) {
            if (orderType.equals("cheese"))
                return new BJCheesePizza();
            else if (orderType.equals("pepper"))
                return new BJPepperPizza();
            else {
                System.out.println("没有" + orderType + "品种的披萨");
                return null;
            }
        }
        return null;
    }
}
