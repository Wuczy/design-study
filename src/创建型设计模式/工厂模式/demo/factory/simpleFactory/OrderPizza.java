package 创建型设计模式.工厂模式.demo.factory.simpleFactory;

import 创建型设计模式.工厂模式.demo.pojo.Pizza;

/**
 * @ProjectName: 设计模式
 * @ClassName: OrderPizza
 * @Auther: wczy
 * @Date: 2020-11-30 12:53
 * @Version 1.0
 **/
public class OrderPizza {
    //定义一个简单工厂对象
    SimpleFactory simpleFactory ;
    Pizza pizza;
    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }
    //下单
    public void createPizza(String ordertype){
        do {
            pizza = simpleFactory.createPizza(ordertype);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                break;
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }

    public void createPizza1(String ordertype){
        do {
            pizza = SimpleFactory.createPizza1(ordertype);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                break;
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }
}
