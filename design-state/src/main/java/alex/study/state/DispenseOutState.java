package alex.study.state;

/**
 * 奖品发放完状态
 * @author zhanghao
 * @date 2020/11/18 14:07
 */
public class DispenseOutState extends State {

    RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deduceMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
