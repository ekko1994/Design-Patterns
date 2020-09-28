package alex.study.abstractfactory.concrete.factory;

import alex.study.abstractfactory.abstraction.factory.ElectricFactory;
import alex.study.abstractfactory.abstraction.product.AirConditioner;
import alex.study.abstractfactory.abstraction.product.TV;
import alex.study.abstractfactory.concrete.product.HaierAirConditioner;
import alex.study.abstractfactory.concrete.product.HaierTV;

/**
 * 海尔厂家：实现了生产电视机和空调的方法
 * @author zhanghao
 * @date 2020/9/28 16:01
 */
public class Haier implements ElectricFactory {
    public TV createTV() {
        return new HaierTV();
    }

    public AirConditioner createAirConditioner() {
        return new HaierAirConditioner();
    }
}
