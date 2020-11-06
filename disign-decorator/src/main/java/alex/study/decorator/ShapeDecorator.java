package alex.study.decorator;

/**
 * @author zhanghao
 * @date 2020/11/5 16:46
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
