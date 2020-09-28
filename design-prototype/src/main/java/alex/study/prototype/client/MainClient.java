package alex.study.prototype.client;

import alex.study.prototype.concrete.Sheep;

/**
 * 原型设计模式测试类
 *
 * @author zhanghao
 * @create 2020-09-28 20:36
 */
public class MainClient {

    public static void main(String[] args) {
        try {
            Sheep sheep = new Sheep("jack", 2);
            Sheep clone = (Sheep) sheep.clone();
            System.out.println(sheep);
            System.out.println(clone);
            System.out.println(sheep.hashCode() == clone.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
