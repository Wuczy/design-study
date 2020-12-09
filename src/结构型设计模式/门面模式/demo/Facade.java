package 结构型设计模式.门面模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: Facade
 * @Auther: wczy
 * @Date: 2020-12-09 20:23
 * @Version 1.0
 **/
public class Facade {
    private final SubSystemA a;
    private final SubSystemB b;
    private final SubSystemC c;

    public Facade(){
        a = new SubSystemA();
        b = new SubSystemB();
        c = new SubSystemC();
    }

    //三个外部接口
    public void doA(){
        a.doA();
    }

    public void doB(){
        b.doB();
    }

    public void doC(){
        c.doC();
    }
}
