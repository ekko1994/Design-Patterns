package alex.study.decorator;

/**
 * @author zhanghao
 * @date 2020/11/5 16:41
 */
public class MainClient {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();
        System.out.println();

        RedShapeDecorator circleDecorator = new RedShapeDecorator(new Circle());
        circleDecorator.draw();
        System.out.println();

        RedShapeDecorator rectangleDecorator = new RedShapeDecorator(new Rectangle());
        rectangleDecorator.draw();

    }
}
