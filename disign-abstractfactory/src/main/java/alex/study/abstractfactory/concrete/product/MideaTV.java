package alex.study.abstractfactory.concrete.product;

import alex.study.abstractfactory.abstraction.product.TV;

/**
 * 美的电视机：实现了电视机的展示方法
 *
 * @author zhanghao
 * @date 2020/9/28 16:04
 */
public class MideaTV implements TV {

    public void show() {
        System.out.println("美的电视机...");
    }
}
