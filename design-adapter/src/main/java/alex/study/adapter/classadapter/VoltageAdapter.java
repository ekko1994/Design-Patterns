package alex.study.adapter.classadapter;

/**
 * 适配器完成220V电压转换为5V电压
 * @author zhanghao
 * @date 2020/11/5 13:47
 */
public class VoltageAdapter extends Voltage220V implements Voaltage5V {

    @Override
    public int output5V() {
        System.out.println("适配为5V电压");
        return output220V()/44;
    }
}
