package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 14:59
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    void display() {
        System.out.println("这是玩具鸭！");
    }
}
