package 创建型设计模式.原型模式.demo.clone;

/**
 * @ProjectName: 设计模式
 * @ClassName: Sheep
 * @Auther: wczy
 * @Date: 2020-12-01 21:33
 * @Version 1.0
 **/
public class Sheep implements Cloneable {
    private String name;
    private Integer age;
    private String color;
    private String address = "蒙古羊";
    //对象，克隆是会如何处理，默认是浅拷贝
    public Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep)super.clone();
        return sheep;
    }
}
