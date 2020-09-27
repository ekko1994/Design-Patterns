package alex.study.singleton.type8;

/**
 * 枚举
 *
 * @author zhanghao
 * @date 2020/9/27 14:51
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() == instance1.hashCode());
        instance.method();
    }
}

enum Singleton {
    INSTANCE;

    public void method() {
        System.out.println("hello");
    }
}
