package 创建型设计模式.工厂模式.demo.factory.absFactory.factory;

import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.Aircondition;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.Engine;

//抽象工厂
public interface AbsFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
