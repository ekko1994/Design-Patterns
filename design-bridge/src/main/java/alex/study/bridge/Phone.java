package alex.study.bridge;

/**
 * @author zhanghao
 * @date 2020/11/5 15:55
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }

    public void close(){
        brand.close();
    }

    public void call(){
        brand.call();
    }
}
