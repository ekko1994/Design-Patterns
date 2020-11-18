package alex.study.state;

/**
 * @author zhanghao
 * @date 2020/11/18 13:55
 */
public class NoRaffleState extends State{

    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deduceMoney() {
        System.out.println("扣除50积分，可以抽奖了！");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
