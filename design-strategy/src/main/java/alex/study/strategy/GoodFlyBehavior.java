package alex.study.strategy;

/**
 * @author zhanghao
 * @date 2020/11/18 14:48
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的好~");
    }
}
