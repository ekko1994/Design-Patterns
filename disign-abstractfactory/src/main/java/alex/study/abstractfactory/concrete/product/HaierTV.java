package alex.study.abstractfactory.concrete.product;

import alex.study.abstractfactory.abstraction.product.TV;

/**
 * 海尔电视机：实现了展示方法
 *
 * @author zhanghao
 * @date 2020/9/28 16:07
 */
public class HaierTV implements TV {

    public void show() {
        System.out.println("海尔电视机...");
    }
}
