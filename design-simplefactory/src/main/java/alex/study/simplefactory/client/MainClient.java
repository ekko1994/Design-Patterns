package alex.study.simplefactory.client;

import alex.study.simplefactory.abstraction.Product;
import alex.study.simplefactory.constant.ProductTypeConstant;
import alex.study.simplefactory.factory.ProductSimpleFactory;

/**
 * 客户端
 *
 * @author zhanghao
 * @date 2020/9/28 11:02
 */
public class MainClient {

    public static void main(String[] args) {
        Product product = ProductSimpleFactory.createProduct(ProductTypeConstant.PRODUCT_A);
        if (product != null) {
            product.show();
        }
    }
}
