package 创建型设计模式.工厂模式.demo.factory.absFactory.factory;

import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.Aircondition;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.AirconditionB;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.Engine;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.EngineB;

//为宝马车生产配件
public class 宝马工厂 implements AbsFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }    
    @Override    
    public Aircondition createAircondition() {
        return new AirconditionB();
    }    
}