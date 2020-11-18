package alex.study.state;

/**
 * 发放奖品的状态
 * @author zhanghao
 * @date 2020/11/18 14:05
 */
public class DispenseState extends State{

    RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    void dispensePrize() {
        if(raffleActivity.getCount() > 0){
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRafflleState());
        }else{
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            raffleActivity.setState(raffleActivity.getDispensOutState());
            //System.out.println("抽奖活动结束");
            //System.exit(0);
        }
    }
}
