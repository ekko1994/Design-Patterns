package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 14:57
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("北京鸭");
    }
}
