package alex.study.singleton.type2;

/**
 * 饿汉式（静态代码块）
 *
 * @author zhanghao
 * @date 2020/9/27 10:28
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

    private Singleton() {
    }

    private  static final Singleton SINGLETON;

    static {
        SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }
}