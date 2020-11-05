package alex.study.bridge;

/**
 * @author zhanghao
 * @date 2020/11/5 15:53
 */
public class MainClient {

    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
    }
}
