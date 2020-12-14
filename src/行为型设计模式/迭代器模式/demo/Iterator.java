package 行为型设计模式.迭代器模式.demo;

/**
 * @ProjectName: 设计模式
 * @ClassName: Iterator  抽象迭代器
 * @Auther: wczy
 * @Date: 2020-12-14 19:44
 * @Version 1.0
 **/
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
