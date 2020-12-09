package 创建型设计模式.工厂模式.demo.factory.factoryMethod;

import 创建型设计模式.工厂模式.demo.pojo.LDCheesePizza;
import 创建型设计模式.工厂模式.demo.pojo.LDPepperPizza;
import 创建型设计模式.工厂模式.demo.pojo.Pizza;

/**
 * @ProjectName: 设计模式
 * @ClassName: BJOrderPizza
 * @Auther: wczy
 * @Date: 2020-11-30 15:34
 * @Version 1.0
 **/
public class LDOrderPizza implements OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType!=null && !"".equals(orderType.trim())){
            if (orderType.equals("cheese"))
                return new LDCheesePizza();
            else if (orderType.equals("pepper"))
                return new LDPepperPizza();
            else {
                System.out.println("没有"+orderType+"品种的披萨");
                return null;
            }
        }
        return null;
    }
}
