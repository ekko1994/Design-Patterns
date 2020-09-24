package alex.study.principle.inversion;

/**
 * 依赖传递的三种方式：接口传递、构造方法传递、setter方法传递
 *
 * @author zhanghao
 * @date 2020/9/24 10:03
 */
public class DependencyPass {

    public static void main(String[] args) {
        // 方式一：通过接口依赖传递
//        OpenAndClose openAndClose = new OpenAndClose();
//        ChangHong changHong = new ChangHong();
//        openAndClose.open(changHong);

        // 方式二：通过构造方法依赖传递
//        OpenAndClose openAndClose = new OpenAndClose(new ChangHong());
//        openAndClose.open();

        // 方式三：通过setter方法依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(new ChangHong());
        openAndClose.open();

    }
}

/**
 * 方式一：通过接口依赖传递
 * <p>
 * 方式二：通过构造方法依赖传递
 */
/*

interface IOpenAndClose {
    void open(ITV itv);
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    public void open(ITV itv) {
        itv.play();
    }
}

class ChangHong implements ITV {

    public void play() {
        System.out.println("打开长虹电视机");
    }
}
*/


/**
 * 方式二：通过构造方法依赖传递
 */
/*

interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    public void open() {
        itv.play();
    }
}

class ChangHong implements ITV {

    public void play() {
        System.out.println("打开长虹电视");
    }
}
*/

/**
 * 方式三：通过setter方法依赖传递
 */
interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV itv;

    public void setItv(ITV itv) {
        this.itv = itv;
    }

    public void open() {
        itv.play();
    }
}

class ChangHong implements ITV {

    public void play() {
        System.out.println("打开长虹电视机");
    }
}

