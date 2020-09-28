package alex.study.factorymethod.client;

import alex.study.factorymethod.abstraction.factory.AbstractFactory;
import alex.study.factorymethod.abstraction.product.Product;
import alex.study.factorymethod.concrete.factory.ConcreteFactory1;

/**
 * @author zhanghao
 * @date 2020/9/28 15:07
 */
public class MainClient {

    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        Product product = concreteFactory1.createProduct();
        product.show();
    }
}
