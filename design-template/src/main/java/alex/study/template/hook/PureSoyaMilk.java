package alex.study.template.hook;

/**
 * 纯豆浆
 * @author zhanghao
 * @date 2020/11/12 10:23
 */
public class PureSoyaMilk extends SoyaMilk{

    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
