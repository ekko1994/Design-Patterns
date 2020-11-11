package alex.study.proxy.cglib;

/**
 * @author zhanghao
 * @date 2020/11/10 16:21
 */
public class MainClient {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
