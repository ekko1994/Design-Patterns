package alex.study.facade;

/**
 * @author zhanghao
 * @date 2020/11/10 11:12
 */
public class ShapeFacade {

    private Circle circle;
    private Rectangle rectangle;
    private  Square square;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
