package 创建型设计模式.原型模式.demo.deepClone;

import java.io.Serializable;

/**
 * @ProjectName: 设计模式
 * @ClassName: DeepCloneTarget
 * @Auther: wczy
 * @Date: 2020-12-01 22:50
 * @Version 1.0
 **/
public class DeepCloneTarget implements Cloneable, Serializable {
    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    //因为该类的属性都是String，所以使用默认的clone完成深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
