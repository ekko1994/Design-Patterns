package alex.study.observer;

/**
 * @author zhanghao
 * @date 2020/11/16 15:53
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
