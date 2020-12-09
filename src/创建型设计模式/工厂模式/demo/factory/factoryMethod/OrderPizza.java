package 创建型设计模式.工厂模式.demo.factory.factoryMethod;

import 创建型设计模式.工厂模式.demo.pojo.Pizza;

/**
 * @ProjectName: 设计模式
 * @ClassName: OrderPizza
 * @Auther: wczy
 * @Date: 2020-11-30 13:41
 * @Version 1.0
 **/
public interface OrderPizza {
    //定义一个抽象方法，让各个工厂子类自己实现
    Pizza createPizza(String orderType);
}
