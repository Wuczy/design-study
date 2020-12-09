package 结构型设计模式.适配器模式.objectAdapter;

/**
 * @ProjectName: 设计模式
 * @ClassName: Adaptee  200V为被适配类
 * @Auther: wczy
 * @Date: 2020-12-02 22:48
 * @Version 1.0
 **/
public class Adaptee {
    public int  output220V(){
        int src = 220;
        System.out.println("电压："+src);
        return src;
    }
}
