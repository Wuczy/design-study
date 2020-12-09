package 创建型设计模式.建造者模式.demo.Test1;

/**
 * @ProjectName: 设计模式
 * @ClassName: ConcreteBuilder
 * @Auther:
 * @Date: 2020-12-06 18:34
 * @Version 1.0
 **/
public class ConcreteBuilder implements IBuilder {
    private People product = new People();

    @Override
    public IBuilder addName(String name) {
        product.setName(name);
        return this;
    }

    @Override
    public IBuilder addAge(int age) {
        product.setAge(age);
        return this;
    }

    @Override
    public IBuilder addSex(byte sex) {
        product.setSex(sex);
        return this;
    }

    @Override
    public People build() {
        return product;
    }
}
