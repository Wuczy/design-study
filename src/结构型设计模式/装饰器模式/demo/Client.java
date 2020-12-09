package 结构型设计模式.装饰器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client
 * @Auther: wczy
 * @Date: 2020-12-07 23:38
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //被装饰对象
        Component component1 = new ConcreteComponent();
        //给对象透明地增加A功能
        Decorator concreteComponentA = new ConcreteComponentA(component1);
        concreteComponentA.operation();
        //给对象透明地增加B功能
        Decorator concreteComponentB = new ConcreteComponentB(component1);
        concreteComponentB.operation();
        //装饰器也可以装饰具体的装饰对象，比如给当前对象加A功能的基础上再加B功能
        Decorator concreteComponentBandA = new ConcreteComponentB(concreteComponentA);
        concreteComponentBandA.operation();

    }
}
