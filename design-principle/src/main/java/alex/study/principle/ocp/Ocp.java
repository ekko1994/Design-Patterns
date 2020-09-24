package alex.study.principle.ocp;

/**
 * @author zhanghao
 * @date 2020/9/24 14:46
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        Rectangle rectangle = new Rectangle();
        graphicEditor.drawShape(rectangle);

    }
}

class GraphicEditor {

    /**
     * 问题：每新增一个图形都要在方法里添加一段代码逻辑
     * 违反了ocp原则，即对扩展开放（功能提供方），对修改关闭（使用方）。
     */
    void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle();
        } else if (s.m_type == 2) {
            drawCircle();
        }
    }

    void drawRectangle() {
        System.out.println("画一个矩形");
    }

    void drawCircle() {
        System.out.println("画一个圆形");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}


