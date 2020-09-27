package alex.study.singleton.type3;

/**
 * 懒汉式（线程不安全）
 *
 * @author zhanghao
 * @date 2020/9/27 14:19
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 提供一个静态共有方法，当调用该方法，才去创建实例对象，即懒汉式
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

