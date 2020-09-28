package alex.study.abstractfactory.client;

import alex.study.abstractfactory.abstraction.product.AirConditioner;
import alex.study.abstractfactory.abstraction.product.TV;
import alex.study.abstractfactory.concrete.factory.Midea;

/**
 * @author zhanghao
 * @date 2020/9/28 15:57
 */
public class MainClient {

    public static void main(String[] args) {
        // 生产美的电视机和美的空调
        Midea midea = new Midea();
        TV tv = midea.createTV();
        AirConditioner airConditioner = midea.createAirConditioner();
        tv.show();
        airConditioner.show();
    }
}
