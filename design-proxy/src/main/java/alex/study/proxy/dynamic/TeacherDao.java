package alex.study.proxy.dynamic;

/**
 * @author zhanghao
 * @date 2020/11/10 16:23
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("被代理类teach()...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("你好，" + name);
    }
}
