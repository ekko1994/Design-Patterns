package alex.study.abstractfactory.concrete.product;

import alex.study.abstractfactory.abstraction.product.AirConditioner;

/**
 * 海尔空调：实现了展示的方法
 *
 * @author zhanghao
 * @date 2020/9/28 16:08
 */
public class HaierAirConditioner implements AirConditioner {

    public void show() {
        System.out.println("海尔空调...");
    }
}
