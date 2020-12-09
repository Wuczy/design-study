package 创建型设计模式.单例模式.singleton;

import java.io.*;

/**
 * @ProjectName: 设计模式
 * @ClassName: Singleton6 双重检查 Lazy Loading
 * @Auther: wczy
 * @Date: 2020-11-26 21:19
 * @Version 1.0
 **/
public class Singleton6 implements Serializable {
    //1、构造私有化
    private Singleton6(){}
    //2、创建单例对象
    private static volatile Singleton6 instance;
    //3、提供一个静态方法，加入同步处理代码，解决线程安全问题,同时解决Lazy Loading问题
    public static Singleton6 getInstance(){
        if (instance == null){
            synchronized (Singleton6.class){
                if (instance == null)
                    instance = new Singleton6();
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception{
        //通过getInstance方法获取的单例对象
        Singleton6 instance = Singleton6.getInstance();
        //通过反射获取的单例对象
        Singleton6 newInstance = Singleton6.class.getDeclaredConstructor().newInstance();
        //确定两个对象是否为同一个(结果为false)
        System.out.println(instance == newInstance);
        //通过序列化创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("newSingleton"));
        oos.writeObject(instance);
        oos.flush();
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("newSingleton"));
        Singleton6 newSingleton = (Singleton6)ois.readObject();
        ois.close();
        //确定两个对象是否为同一个(结果为false)
        System.out.println(instance == newSingleton);
    }
}
