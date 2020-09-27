package alex.study.singleton.type1;

/**
 * 饿汉式（静态常量）
 *
 * @author zhanghao
 * @date 2020/9/27 10:14
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}

class Singleton {
    // 1、构造器私有化
    private Singleton() {
    }

    // 2、本类内部创建对象实例
    private final static Singleton SINGLETON = new Singleton();

    // 3、提供共有方法，返回对象实例
    public static Singleton getInstance() {
        return SINGLETON;
    }
}
