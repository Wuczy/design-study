package 结构型设计模式.装饰器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: Decorator
 * @Auther: wczy
 * @Date: 2020-12-07 23:29
 * @Version 1.0
 **/
public abstract class Decorator extends Component {
    //持有组件对象
    protected Component component;
    //构造方法，传入组件对象
    public Decorator(Component component){
        this.component = component;
    }
    //转发请求到组件对象，可以在转发前后执行一些附加操作
    public void operation(){
        component.operation();
    }
}
