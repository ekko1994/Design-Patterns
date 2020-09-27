package alex.study.singleton.type5;

/**
 * 懒汉式（线程安全，同步代码块）
 *
 * @author zhanghao
 * @date 2020/9/27 14:34
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
        if (singleton == null) {
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
