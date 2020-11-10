package alex.study.flyweight;

/**
 * @author zhanghao
 * @date 2020/11/10 15:17
 */
public class ConcreteWebSite extends WebSite {

    // 共享部分
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
