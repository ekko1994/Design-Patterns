package alex.study.composite;

/**
 * @author zhanghao
 * @date 2020/11/6 14:26
 */
public class MainClient {

    public static void main(String[] args) {
        University university = new University("清华大学", "一流大学");

        College computerCollege = new College(" 计 算 机 学 院 ", " 计 算 机 学 院 ");
        College informationCollege = new College("信息工程学院", " 信息工程学院 ");

        computerCollege.add(new Department("软件工程", "软件工程不错"));
        computerCollege.add(new Department("网络工程", "网络工程不错"));

        informationCollege.add(new Department("通信工程", " 通信工程不好学 "));
        informationCollege.add(new Department("信息工程", " 信息工程好学 "));

        university.add(computerCollege);
        university.add(informationCollege);

        university.print();
    }
}
