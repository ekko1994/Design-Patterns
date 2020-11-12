package alex.study.visitor;

/**
 * @author zhanghao
 * @date 2020/11/12 15:40
 */
public class Woman extends Person {

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
