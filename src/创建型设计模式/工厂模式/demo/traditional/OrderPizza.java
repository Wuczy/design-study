package 创建型设计模式.工厂模式.demo.traditional;

import 创建型设计模式.工厂模式.demo.pojo.Pizza;
import 创建型设计模式.工厂模式.demo.pojo.GreekPizza;

/**
 * @ProjectName: 设计模式
 * @ClassName: OederPizza  传统方式下单
 * @Auther: wczy
 * @Date: 2020-11-28 16:07
 * @Version 1.0
 **/
public class OrderPizza {
    Pizza pizza = null;
    public OrderPizza(String orderType){
        if (orderType!=null && !"".equals(orderType.trim())){
            if (orderType.equals("greek"))
                pizza = new GreekPizza();
            else if (orderType.equals("cheese"))
                pizza = new GreekPizza();
            else if (orderType.equals("china"))
                pizza = new GreekPizza();
            else {
                System.out.println("没有"+orderType+"品种的披萨");
                return;
            }
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

