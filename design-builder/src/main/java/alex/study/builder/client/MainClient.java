package alex.study.builder.client;

import alex.study.builder.builder.concrete.CommonHouse;
import alex.study.builder.director.HouseDirector;

/**
 * 客户端
 * @author zhanghao
 * @date 2020/11/4 13:51
 */
public class MainClient {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();
    }
}
