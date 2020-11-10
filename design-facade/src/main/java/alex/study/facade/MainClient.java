package alex.study.facade;

/**
 * @author zhanghao
 * @date 2020/11/10 11:06
 */
public class MainClient {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
