package 创建型设计模式.原型模式.demo.deepClone;

import java.io.*;

/**
 * @ProjectName: 设计模式
 * @ClassName: DeepProtoType  实现深拷贝
 * @Auther: wczy
 * @Date: 2020-12-01 22:54
 * @Version 1.0
 **/
public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    //引用类型
    public DeepCloneTarget deepCloneTarget;

    public DeepProtoType(){
        super();
    }

    //方式一：重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //先完成基本数据类型和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneTarget = (DeepCloneTarget)deepCloneTarget.clone();
        return deepProtoType;
    }

    //方式二：通过对象的序列化实现（推荐）
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //将当前这个对象以对象流的方式输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType)ois.readObject();
            return deepProtoType;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
