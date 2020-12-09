package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton5  饿汉式（线程安全，同步代码块）
 * @Auther: wczy
 * @Date: 2020-11-26 20:21
 * @Version 1.0
 **/
public class Singleton5 {
    //1、构造私有化
    private Singleton5(){}
    //2、创建单例对象
    private static Singleton5 instance;
    //3、提供一个静态方法，加入同步处理代码，解决线程安全问题
    public static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
