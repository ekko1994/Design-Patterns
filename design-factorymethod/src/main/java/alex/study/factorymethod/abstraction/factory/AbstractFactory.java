package alex.study.factorymethod.abstraction.factory;

import alex.study.factorymethod.abstraction.product.Product;

/**
 * 抽象工厂接口：提供了产品的生成方法
 *
 * @author zhanghao
 * @date 2020/9/28 14:45
 */
public interface AbstractFactory {

    Product createProduct();

}
