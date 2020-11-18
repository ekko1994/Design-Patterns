package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 15:00
 */
public class MainClient {

    public static void main(String[] args) {
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();

    }
}
