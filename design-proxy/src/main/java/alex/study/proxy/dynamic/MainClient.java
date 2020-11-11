package alex.study.proxy.dynamic;

/**
 * @author zhanghao
 * @date 2020/11/10 16:21
 */
public class MainClient {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.sayHello("jack");
    }
}
