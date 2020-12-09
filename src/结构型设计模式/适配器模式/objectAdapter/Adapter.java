package 结构型设计模式.适配器模式.objectAdapter;

import 结构型设计模式.适配器模式.classAdapter.Target;

/**
 * @ProjectName: 设计模式
 * @ClassName: Adapter  适配器类
 * @Auther: wczy
 * @Date: 2020-12-02 22:48
 * @Version 1.0
 **/
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();
    @Override
    public int output5V() {
        int src = adaptee.output220V();
        int dst = src/44;
        return dst;
    }
}
