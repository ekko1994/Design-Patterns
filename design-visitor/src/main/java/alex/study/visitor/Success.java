package alex.study.visitor;

/**
 * @author zhanghao
 * @date 2020/11/12 15:40
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人好评~");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人好评！");
    }
}
