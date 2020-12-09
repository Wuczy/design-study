package 结构型设计模式.适配器模式.classAdapter;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client  手机为客户端
 * @Auther: wczy
 * @Date: 2020-12-02 22:22
 * @Version 1.0
 **/
public class Client {
    Target target = new Adapter();
    public void charge(){
        int src = target.output5V();
        if (src==5) System.out.println("充电中");
    }


}
