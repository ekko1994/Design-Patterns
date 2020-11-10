package alex.study.flyweight;

/**
 * @author zhanghao
 * @date 2020/11/10 15:14
 */
public class MainClient {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite site1 = webSiteFactory.getWebSite("博客");

        User jack = new User("jack");
        site1.use(jack);

        User tom = new User("tom");
        site1.use(tom);

        WebSite site2 = webSiteFactory.getWebSite("新聞");
        site2.use(tom);

        int counts = webSiteFactory.getWebSiteCounts();
        System.out.println(counts);

    }
}
