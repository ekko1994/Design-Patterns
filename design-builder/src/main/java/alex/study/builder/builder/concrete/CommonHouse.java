package alex.study.builder.builder.concrete;

import alex.study.builder.builder.HouseBuilder;

/**
 * @author zhanghao
 * @date 2020/11/4 14:16
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
