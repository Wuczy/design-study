package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton3  饿汉式（线程不安全）
 * @Auther: wczy
 * @Date: 2020-11-26 20:00
 * @Version 1.0
 **/
public class Singleton3 {
    //1、构造器私有化
    private Singleton3(){}
    //2、创建单例对象
    private static Singleton3 instance;
    //3、提供一个静态方法，当用到该方法时采取创建instance
    public static Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
