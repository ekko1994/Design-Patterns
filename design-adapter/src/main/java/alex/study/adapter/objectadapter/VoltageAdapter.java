package alex.study.adapter.objectadapter;

/**
 * 适配器完成220V电压转换为5V电压
 * @author zhanghao
 * @date 2020/11/5 13:47
 */
public class VoltageAdapter implements Voaltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        System.out.println("适配为5V电压");
        return voltage220V.output220V()/44;
    }
}
