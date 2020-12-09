package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton 饿汉式（静态常量）
 * @Auther: wczy
 * @Date: 2020-11-26 19:33
 * @Version 1.0
 **/
public class Singleton1 {
    //1、构造器私有化
    private Singleton1(){}
    //2、类的内部创建对象
    private static final Singleton1 instance = new Singleton1();
    //3、向外暴露一哥静态的公共方法，getInstance()
    public Singleton1 getInstance(){
        return instance;
    }
}
