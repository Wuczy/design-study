package 结构型设计模式.装饰器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: ConcreteComponentA
 * @Auther: wczy
 * @Date: 2020-12-07 23:33
 * @Version 1.0
 **/
public class ConcreteComponentA extends Decorator {

    public ConcreteComponentA(Component component) {
        super(component);
    }
    private void operationFirst(){
        System.out.println("之前");
    }
    private void operationLast(){
        System.out.println("之后");
    }
    public void operation(){
        //调用父类的方法，可以在调用前后执行一些附加操作
        //如果不调用父类方法，就相当于完全改写了方法，实现的新功能
        operationFirst();
        super.operation();
        operationLast();
    }
}
