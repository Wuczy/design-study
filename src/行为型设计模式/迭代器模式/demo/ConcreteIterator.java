package 行为型设计模式.迭代器模式.demo;

import java.util.List;

/**
 * @ProjectName: 设计模式
 * @ClassName: ConcreteIterator  具体迭代器
 * @Auther: wczy
 * @Date: 2020-12-14 19:46
 * @Version 1.0
 **/
public class ConcreteIterator<E> implements Iterator<E>{
    private List<E> list;
    //记录当前游标所除位置
    private int cursor = 0;

    public ConcreteIterator(List<E> list){
        this.list = list;
    }
    @Override
    public E next() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor<list.size();
    }
}
