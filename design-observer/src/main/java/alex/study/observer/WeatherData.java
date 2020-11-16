package alex.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/16 16:22
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
