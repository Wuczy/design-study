package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton7  静态内部类
 * @Auther: wczy
 * @Date: 2020-11-26 21:29
 * @Version 1.0
 **/
public class Singleton7 {
    //1、构造器私有化
    private Singleton7(){}
    //2、创建单例对象
    private static volatile Singleton7 instance;
    //3、一个静态内部类，该类中有一个静态属性Singleton7
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    //4、提供一个静态方法，直接返回SingletonInstance.INSTANCE
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
