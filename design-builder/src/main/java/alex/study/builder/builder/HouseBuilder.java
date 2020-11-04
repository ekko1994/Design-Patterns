package alex.study.builder.builder;

import alex.study.builder.product.House;

/**
 * 抽象建造者
 * @author zhanghao
 * @date 2020/11/4 14:09
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
