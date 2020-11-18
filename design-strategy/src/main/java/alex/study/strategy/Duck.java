package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 14:51
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 显示鸭子的信息
    abstract void display();

    public void swim(){
        System.out.println("鸭子会游泳~~");
    }

    public void quack(){
        System.out.println("鸭子嘎嘎叫！");
    }

    public void fly(){
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
