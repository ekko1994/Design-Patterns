package alex.study.visitor;

/**
 * @author zhanghao
 * @date 2020/11/12 15:39
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
