package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton8  枚举
 * @Auther: wczy
 * @Date: 2020-11-26 21:44
 * @Version 1.0
 **/
public class Singleton8 {
    //1、构造私有化
    private Singleton8(){}
    //2、使用枚举类型
    private enum Singleton{
        //3、定义INSTANCE常量
        INSTANCE;
        //4、创建单例对象
        private final Singleton8 instance;
        //5、在枚举类构造器中实例化单例对象
        Singleton(){
            instance = new Singleton8();
        }
        //6、定义getInstance方法返回instance
        private Singleton8 getInstance(){
            return instance;
        }
    }
    //8、提供对外开发的静态方法返回实例对象
    public static Singleton8 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
}
