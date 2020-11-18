package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 14:49
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的不好~");
    }
}
