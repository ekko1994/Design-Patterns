package alex.study.singleton.type7;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.security.PrivateKey;

/**
 * 静态内部类
 *
 * @author zhanghao
 * @date 2020/9/27 14:48
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

    private Singleton() {}

    private static class SingletonInstance{
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.SINGLETON;
    }
}
