package alex.study.observer;

/**
 * @author zhanghao
 * @date 2020/11/16 15:59
 */
public class SinaSite implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("sina温度：" + temperature);
        System.out.println("sina气压：" + pressure);
        System.out.println("sina湿度：" + humidity);
    }
}
