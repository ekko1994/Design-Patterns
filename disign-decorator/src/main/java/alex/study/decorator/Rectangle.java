package alex.study.decorator;

/**
 * @author zhanghao
 * @date 2020/11/5 16:45
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画矩形...");
    }
}
