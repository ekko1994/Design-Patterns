package alex.study.adapter.objectadapter;

/**
 * @author zhanghao
 * @date 2020/11/5 13:39
 */
public class MainClient {

    public static void main(String[] args) {
        System.out.println("对象适配模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));

    }
}
