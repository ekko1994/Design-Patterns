package alex.study.observer;

/**
 * @author zhanghao
 * @date 2020/11/16 15:54
 */
public class BaiduSite implements Observer {

    // 温度
    private float temperature;
    // 气压
    private float pressure;
    // 湿度
    private  float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Baidu温度：" + temperature);
        System.out.println("Baidu气压：" + pressure);
        System.out.println("Baidu湿度：" + humidity);
    }
}
