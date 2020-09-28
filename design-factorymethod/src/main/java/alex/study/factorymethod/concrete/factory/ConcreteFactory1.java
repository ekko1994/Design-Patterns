package alex.study.factorymethod.concrete.factory;

import alex.study.factorymethod.abstraction.factory.AbstractFactory;
import alex.study.factorymethod.abstraction.product.Product;
import alex.study.factorymethod.concrete.product.ConcreteProduct1;

/**
 * 具体工厂1：实现了产品的生成方法
 *
 * @author zhanghao
 * @date 2020/9/28 15:04
 */
public class ConcreteFactory1 implements AbstractFactory {

    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
