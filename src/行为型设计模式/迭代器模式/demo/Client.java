package 行为型设计模式.迭代器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client
 * @Auther: wczy
 * @Date: 2020-12-14 20:00
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteIAggregate<String> stringConcreteIAggregate = new ConcreteIAggregate<>();
        stringConcreteIAggregate.add("橙汁");
        stringConcreteIAggregate.add("橙子");
        stringConcreteIAggregate.add("Orange");
        Iterator<String> iterator = stringConcreteIAggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
