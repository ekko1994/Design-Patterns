package alex.study.decorator;

/**
 * @author zhanghao
 * @date 2020/11/5 16:49
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setShape(shape);
    }

    private void setShape(Shape shape){
        System.out.println("扩展红色");
    }
}
