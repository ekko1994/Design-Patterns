package alex.study.principle.ocp.improve;

/**
 * @author zhanghao
 * @date 2020/9/24 14:46
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        Rectangle rectangle = new Rectangle();
        graphicEditor.drawShape(rectangle);

        Circle circle = new Circle();
        graphicEditor.drawShape(circle);

    }
}

class GraphicEditor {

    void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("画一个矩形");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("画一个圆形");
    }
}


