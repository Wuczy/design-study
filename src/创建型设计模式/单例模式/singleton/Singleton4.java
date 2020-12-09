package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton4  饿汉式（线程安全，同步方法）
 * @Auther: wczy
 * @Date: 2020-11-26 20:15
 * @Version 1.0
 **/
public class Singleton4 {
    //1、构造私有化
    private Singleton4(){}
    //2、创建单例对象
    private static Singleton4 instance;
    //3、提供一个静态方法，加入同步处理代码，解决线程安全问题
    public static synchronized Singleton4 getInstance(){
        if (instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
