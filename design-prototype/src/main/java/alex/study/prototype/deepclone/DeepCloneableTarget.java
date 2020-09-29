package alex.study.prototype.deepclone;

import java.io.Serializable;

/**
 * @author zhanghao
 * @date 2020/9/29 14:56
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private String field1;
    private String field2;

    public DeepCloneableTarget(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}
