package alex.study.abstractfactory.abstraction.factory;

import alex.study.abstractfactory.abstraction.product.AirConditioner;
import alex.study.abstractfactory.abstraction.product.TV;

/**
 * 电子厂：提供了生产电视机和空调的方法
 *
 * @author zhanghao
 * @date 2020/9/28 15:49
 */
public interface ElectricFactory {

    TV createTV();

    AirConditioner createAirConditioner();
}
