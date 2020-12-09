package 创建型设计模式.工厂模式.demo.factory.absFactory.pojo;

import java.util.Calendar;

public class EngineB implements Engine{
    public EngineB(){    
        System.out.println("制造-->EngineB");
        Calendar.getInstance();
    }    
} 