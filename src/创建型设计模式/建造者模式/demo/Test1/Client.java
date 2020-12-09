package 创建型设计模式.建造者模式.demo.Test1;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client
 * @Auther: wczy
 * @Date: 2020-12-06 18:35
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder()
                .addName("橙汁")
                .addAge(21)
                .addSex((byte)1);
        System.out.println(builder.build());

        IBuilder builder1 = new ConcreteBuilder()
                .addName("橙子")
                .addAge(20)
                .addSex((byte)0);
        System.out.println(builder1.build());

        People.Builder builder2 = new People.Builder()
                .addAge(21)
                .addName("周杰")
                .addSex((byte)1);
        System.out.println(builder2.build());

        StringBuffer stringBuffer = new StringBuffer()
                                    .append("1")
                                    .append(1)
                                    .append((byte)1)
                                    .append((char)1);
    }
}
