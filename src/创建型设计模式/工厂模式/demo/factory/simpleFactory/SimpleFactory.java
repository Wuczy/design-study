package 创建型设计模式.工厂模式.demo.factory.simpleFactory;

import 创建型设计模式.工厂模式.demo.pojo.CheessPizza;
import 创建型设计模式.工厂模式.demo.pojo.ChinaPizza;
import 创建型设计模式.工厂模式.demo.pojo.GreekPizza;
import 创建型设计模式.工厂模式.demo.pojo.Pizza;

/**
 * @ProjectName: 设计模式
 * @ClassName: SimpleFactory  简单工厂类
 * @Auther: wczy
 * @Date: 2020-11-30 12:47
 * @Version 1.0
 **/
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType!=null && !"".equals(orderType.trim())){
            if (orderType.equals("greek"))
                pizza = new GreekPizza();
            else if (orderType.equals("cheese"))
                pizza = new CheessPizza();
            else if (orderType.equals("china"))
                pizza = new ChinaPizza();
            else {
                System.out.println("没有"+orderType+"品种的披萨");
                return null;
            }
        }
        return pizza;
    }

    //简单工厂模式，也叫静态工厂模式
    public static Pizza createPizza1(String orderType){
        Pizza pizza = null;
        if (orderType!=null && !"".equals(orderType.trim())){
            if (orderType.equals("greek"))
                pizza = new GreekPizza();
            else if (orderType.equals("cheese"))
                pizza = new CheessPizza();
            else if (orderType.equals("china"))
                pizza = new ChinaPizza();
            else {
                System.out.println("没有"+orderType+"品种的披萨");
                return null;
            }
        }
        return pizza;
    }
}
