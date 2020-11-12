package alex.study.visitor;

/**
 * 访问者
 * @author zhanghao
 * @date 2020/11/12 15:34
 */
public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
