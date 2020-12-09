package 创建型设计模式.建造者模式.demo.Test1;

public interface IBuilder {
    IBuilder addName(String name);
    IBuilder addAge(int age);
    IBuilder addSex(byte sex);
    People build();
}
