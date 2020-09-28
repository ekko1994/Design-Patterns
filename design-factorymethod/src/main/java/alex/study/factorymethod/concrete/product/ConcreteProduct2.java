package alex.study.factorymethod.concrete.product;

import alex.study.factorymethod.abstraction.product.Product;

/**
 * 具体产品2：实现了抽象产品接口的抽象方法
 *
 * @author zhanghao
 * @date 2020/9/28 14:56
 */
public class ConcreteProduct2 implements Product {

    public void show() {
        System.out.println("具体产品2展示...");
    }
}
