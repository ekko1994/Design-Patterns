package alex.study.prototype.deepclone;

import java.io.*;

/**
 * @author zhanghao
 * @date 2020/9/29 15:10
 */
public class DeepPrototype implements Serializable, Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    /**
     * 深拷贝方式一
     *
     * @param
     * @return java.lang.Object
     * @author zhanghao
     * @date 2020/9/29 15:11
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 这里完成对基本数据类型(属性)和 String 的克隆
        Object clone = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) clone;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepPrototype;
    }

    /**
     * 深拷贝方式二
     * @param
     * @return java.lang.Object
     * @author zhanghao
     * @date 2020/9/29 15:38
     */
    public Object deepClone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype o = (DeepPrototype) ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }
}
