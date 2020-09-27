package alex.study.singleton.type6;

/**
 * 双重检查
 *
 * @author zhanghao
 * @date 2020/9/27 14:45
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}

class Singleton{
    private static volatile Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
