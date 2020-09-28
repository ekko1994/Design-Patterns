package alex.study.simplefactory.factory;

import alex.study.simplefactory.abstraction.Product;
import alex.study.simplefactory.concrete.ConcreteProduct1;
import alex.study.simplefactory.concrete.ConcreteProduct2;
import alex.study.simplefactory.constant.ProductTypeConstant;

/**
 * 简单工厂类
 *
 * @author zhanghao
 * @date 2020/9/28 10:55
 */
public class ProductSimpleFactory {

    public static Product createProduct(int productType) {
        switch (productType) {
            case ProductTypeConstant.PRODUCT_A:
                return new ConcreteProduct1();
            case ProductTypeConstant.PRODUCT_B:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}
