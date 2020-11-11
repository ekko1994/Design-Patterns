package alex.study.proxy.staticproxy;

/**
 * @author zhanghao
 * @date 2020/11/10 16:24
 */
public class TeacherDaoProxy implements ITeacherDao{

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("完成某些操作...");
        teacherDao.teach();
        System.out.println("完成某些操作...");
    }
}
