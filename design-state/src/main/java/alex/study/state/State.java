package alex.study.state;

/**
 * 状态抽象类
 * @author zhanghao
 * @date 2020/11/18 13:38
 */
public abstract class State {

    // 扣减积分
    abstract void deduceMoney();

    // 是否中奖
    abstract boolean raffle();

    // 发放奖品
    abstract void dispensePrize();

}
