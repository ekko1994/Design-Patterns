package alex.study.observer;

/**
 * @author zhanghao
 * @date 2020/11/16 15:53
 */
public class MainClient {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        BaiduSite baiduSite = new BaiduSite();
        SinaSite sinaSite = new SinaSite();
        weatherData.registerObserver(baiduSite);
        weatherData.registerObserver(sinaSite);
        weatherData.setData(25.0f,39.5f,22.1f);

    }
}
