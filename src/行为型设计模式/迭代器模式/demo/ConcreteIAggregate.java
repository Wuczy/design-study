package 行为型设计模式.迭代器模式.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: 设计模式
 * @ClassName: ConcreteIAggregate  具体容器
 * @Auther: wczy
 * @Date: 2020-12-14 19:58
 * @Version 1.0
 **/
public class ConcreteIAggregate<E> implements IAggregate<E> {
    private List<E> list = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return list.add(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(list);
    }
}
