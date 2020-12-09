package 结构型设计模式.适配器模式.classAdapter;

/**
 * @ProjectName: 设计模式
 * @ClassName: Adapter  适配器类
 * @Auther: wczy
 * @Date: 2020-12-02 22:21
 * @Version 1.0
 **/
public class Adapter extends Adaptee implements Target {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src/44;
        return dst;
    }
}
