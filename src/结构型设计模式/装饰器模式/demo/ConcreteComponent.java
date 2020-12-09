package 结构型设计模式.装饰器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: ConcreteComponent
 * @Auther: wczy
 * @Date: 2020-12-07 23:27
 * @Version 1.0
 **/
public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        //相应的功能处理
        System.out.println("Orange Code！");
    }
}
