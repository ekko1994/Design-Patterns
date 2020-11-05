package alex.study.adapter.objectadapter;

/**
 * @author zhanghao
 * @date 2020/11/5 13:50
 */
public class Phone {

    public void charging(Voaltage5V voaltage5V){
        if (voaltage5V.output5V() == 5){
            System.out.println("5V电压,手机充电成功~");
        }else {
            System.out.println("不是5V电压,不能充电~");
        }
    }
}
