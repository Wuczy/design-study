package 创建型设计模式.原型模式.demo.deepClone;

/**
 * @ProjectName: 设计模式
 * @ClassName: Client
 * @Auther: wczy
 * @Date: 2020-12-01 23:07
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType protoType = new DeepProtoType();
        protoType.name = ("橙汁");
        protoType.deepCloneTarget = new DeepCloneTarget("橙子","1415");
        //方式一完成深拷贝
        DeepProtoType protoType1 = (DeepProtoType)protoType.clone();
        //方式二完成深拷贝
        DeepProtoType protoType2 = (DeepProtoType)protoType.deepClone();
        System.out.println(protoType.name+":"+protoType.deepCloneTarget+":"+protoType.deepCloneTarget.hashCode());
        System.out.println(protoType1.name+":"+protoType1.deepCloneTarget+":"+protoType1.deepCloneTarget.hashCode());
        System.out.println(protoType2.name+":"+protoType2.deepCloneTarget+":"+protoType2.deepCloneTarget.hashCode());
    }
}
