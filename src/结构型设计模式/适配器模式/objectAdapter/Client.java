package 结构型设计模式.适配器模式.objectAdapter;

import 结构型设计模式.适配器模式.classAdapter.Adapter;
import 结构型设计模式.适配器模式.classAdapter.Target;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client  手机为客户端
 * @Auther: wczy
 * @Date: 2020-12-02 22:48
 * @Version 1.0
 **/
public class Client {
    Target target = new Adapter();
    public void charge(){
        int src = target.output5V();
        if (src==5) System.out.println("充电中");
    }


}
