package 行为型设计模式.迭代器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: IAggregate  抽象容器
 * @Auther: wczy
 * @Date: 2020-12-14 19:45
 * @Version 1.0
 **/
public interface IAggregate<E> {
    boolean add(E element);
    boolean remove(E element);
    Iterator<E> iterator();
}
