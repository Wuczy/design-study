package 创建型设计模式.工厂模式.demo.pojo;

/**
 * @ProjectName: 设计模式
 * @ClassName: Pizza  披萨父类
 * @Auther: wczy
 * @Date: 2020-11-28 15:59
 * @Version 1.0
 **/
public class Pizza {
    public void prepare(){
        System.out.println("准备");
    }
    public void bake(){
        System.out.println("烤制");
    }
    public void cut(){
        System.out.println("切好");
    }
    public void box(){
        System.out.println("打包");
    }
}
