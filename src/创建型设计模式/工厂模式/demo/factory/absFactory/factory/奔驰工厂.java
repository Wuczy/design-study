package 创建型设计模式.工厂模式.demo.factory.absFactory.factory;

import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.Aircondition;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.AirconditionA;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.Engine;
import 创建型设计模式.工厂模式.demo.factory.absFactory.pojo.EngineA;

//具体工厂类
public class 奔驰工厂 implements AbsFactory{
        
    @Override    
    public Engine createEngine() {
        return new EngineA();
    }    
    @Override    
    public Aircondition createAircondition() {
        return new AirconditionA();
    }    
} 