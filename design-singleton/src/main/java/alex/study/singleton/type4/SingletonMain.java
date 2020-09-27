package alex.study.singleton.type4;

/**
 * 懒汉式（线程安全，同步方法）
 *
 * @author zhanghao
 * @date 2020/9/27 14:27
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

    // 解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
