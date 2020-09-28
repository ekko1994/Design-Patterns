package alex.study.factorymethod.concrete.factory;

import alex.study.factorymethod.abstraction.factory.AbstractFactory;
import alex.study.factorymethod.abstraction.product.Product;
import alex.study.factorymethod.concrete.product.ConcreteProduct2;

/**
 * 具体工厂2：实现了产品的生成方法
 *
 * @author zhanghao
 * @date 2020/9/28 15:05
 */
public class ConcreteFactory2 implements AbstractFactory {

    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
