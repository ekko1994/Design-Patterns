package alex.study.proxy.staticproxy;

/**
 * @author zhanghao
 * @date 2020/11/10 16:21
 */
public class MainClient {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
