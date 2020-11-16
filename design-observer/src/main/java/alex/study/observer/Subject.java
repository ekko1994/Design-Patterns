package alex.study.observer;

/**
 * @author zhanghao
 * @date 2020/11/16 16:12
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
