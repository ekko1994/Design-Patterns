package alex.study.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/11/10 15:20
 */
public class WebSiteFactory {

    // 充当池子
    private Map<String,ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type){
        if (!pool.containsKey(type)) {
            // 创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCounts(){
        return pool.size();
    }
}
