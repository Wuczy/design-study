package 创建型设计模式.单例模式.singleton;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton2 饿汉式（静态代码块）
 * @Auther: wczy
 * @Date: 2020-11-26 19:55
 * @Version 1.0
 **/
public class Singleton2 {
    //1、构造器私有化
    private Singleton2(){}
    //2、类的内部创建对象
    private static final Singleton2 instance;
    //3、在静态代码块中实例化单例对象
    static {
        instance = new Singleton2();
    }
    //4、向外暴露一哥静态的公共方法，getInstance()
    public Singleton2 getInstance(){
        return instance;
    }
}
