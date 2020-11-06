package alex.study.decorator;

/**
 * @author zhanghao
 * @date 2020/11/5 16:44
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆...");
    }
}
