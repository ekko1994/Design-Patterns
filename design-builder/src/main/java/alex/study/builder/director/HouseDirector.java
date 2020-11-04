package alex.study.builder.director;

import alex.study.builder.builder.HouseBuilder;
import alex.study.builder.product.House;

/**
 * 指挥者
 * @author zhanghao
 * @date 2020/11/4 14:20
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
