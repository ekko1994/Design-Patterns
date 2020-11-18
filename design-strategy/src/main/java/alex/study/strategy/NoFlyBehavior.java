package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 14:50
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不会飞~");
    }
}
