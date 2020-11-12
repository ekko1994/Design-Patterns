package alex.study.template;

/**
 * @author zhanghao
 * @date 2020/11/12 9:59
 */
public class MainClient {

    public static void main(String[] args) {
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println();

        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
    }
}
