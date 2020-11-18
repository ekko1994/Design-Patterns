package alex.study.state;

/**
 * @author zhanghao
 * @date 2020/11/18 14:10
 */
public class MainClient {

    public static void main(String[] args) {

        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 0; i < 30; i++) {
            activity.deduceMoney();

            activity.raffle();
        }

    }
}
