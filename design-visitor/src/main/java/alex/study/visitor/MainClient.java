package alex.study.visitor;

/**
 * @author zhanghao
 * @date 2020/11/12 15:48
 */
public class MainClient {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("--------");

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
