package alex.study.abstractfactory.concrete.factory;

import alex.study.abstractfactory.abstraction.factory.ElectricFactory;
import alex.study.abstractfactory.abstraction.product.AirConditioner;
import alex.study.abstractfactory.abstraction.product.TV;
import alex.study.abstractfactory.concrete.product.MideaAirConditioner;
import alex.study.abstractfactory.concrete.product.MideaTV;

/**
 * 美的厂家：实现了生产电视机和空调的方法
 *
 * @author zhanghao
 * @date 2020/9/28 15:59
 */
public class Midea implements ElectricFactory {
    public TV createTV() {
        return new MideaTV();
    }

    public AirConditioner createAirConditioner() {
        return new MideaAirConditioner();
    }
}
