package 创建型设计模式.原型模式.demo.clone;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client
 * @Auther: wczy
 * @Date: 2020-12-01 21:34
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend= new Sheep("jack", 2, "黑色");

        try {
            Sheep sheep1 = (Sheep)sheep.clone();
            Sheep sheep2 = (Sheep)sheep.clone();
            Sheep sheep3 = (Sheep)sheep.clone();
            System.out.println(sheep+":"+sheep.friend+":"+sheep.friend.hashCode());
            System.out.println(sheep1+":"+sheep1.friend+":"+sheep1.friend.hashCode());
            System.out.println(sheep2+":"+sheep2.friend+":"+sheep2.friend.hashCode());
            System.out.println(sheep3+":"+sheep3.friend+":"+sheep3.friend.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
