package alex.study.abstractfactory.concrete.product;

import alex.study.abstractfactory.abstraction.product.AirConditioner;

/**
 * 美的空调：实现了展示方法
 *
 * @author zhanghao
 * @date 2020/9/28 16:05
 */
public class MideaAirConditioner implements AirConditioner {

    public void show() {
        System.out.println("美的空调...");
    }
}
