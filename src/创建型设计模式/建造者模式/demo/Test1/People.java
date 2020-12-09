package 创建型设计模式.建造者模式.demo.Test1;


/**
 * @ProjectName: 设计模式
 * @ClassName: People
 * @Auther: wczy
 * @Date: 2020-12-06 18:33
 * @Version 1.0
 **/
public class People {
    private String name;
    private Integer age;
    private byte sex;

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + (sex==0?"女":"男") + '\'' +
                '}';
    }

    public static class Builder{
        private People product = new People();

        public Builder addName(String name) {
            product.setName(name);
            return this;
        }

        public Builder addAge(int age) {
            product.setAge(age);
            return this;
        }

        public Builder addSex(byte sex) {
            product.setSex(sex);
            return this;
        }

        public People build() {
            return product;
        }

    }
}
