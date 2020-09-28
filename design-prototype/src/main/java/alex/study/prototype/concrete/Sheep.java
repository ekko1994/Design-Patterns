package alex.study.prototype.concrete;

/**
 * 具体原型类
 *
 * @author zhanghao
 * @create 2020-09-28 20:32
 */
public class Sheep implements Cloneable {

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("具体原型创建成功...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sheep() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功...");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
