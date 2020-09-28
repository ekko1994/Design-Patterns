package alex.study.simplefactory.concrete;

import alex.study.simplefactory.abstraction.Product;

/**
 * 具体产品1
 *
 * @author zhanghao
 * @date 2020/9/28 10:50
 */
public class ConcreteProduct1 implements Product {

    public void show() {
        System.out.println("具体产品1展示...");
    }
}
