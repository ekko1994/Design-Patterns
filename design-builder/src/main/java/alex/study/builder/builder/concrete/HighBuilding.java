package alex.study.builder.builder.concrete;

import alex.study.builder.builder.HouseBuilder;

/**
 * @author zhanghao
 * @date 2020/11/4 14:18
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
