package 创建型设计模式.工厂模式.demo;

import 创建型设计模式.工厂模式.demo.factory.absFactory.factory.AbsFactory;
import 创建型设计模式.工厂模式.demo.factory.absFactory.factory.奔驰工厂;

/**
 * @ProjectName: 设计模式
 * @ClassName: Test
 * @Auther: wczy
 * @Date: 2020-11-28 16:38
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        AbsFactory factory = new 奔驰工厂();
        factory.createEngine();
        factory.createAircondition();
    }
}
