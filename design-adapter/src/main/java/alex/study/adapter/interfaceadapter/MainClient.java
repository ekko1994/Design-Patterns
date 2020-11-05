package alex.study.adapter.interfaceadapter;

/**
 * @author zhanghao
 * @date 2020/11/5 14:14
 */
public class MainClient {

    public static void main(String[] args) {
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter(){
            @Override
            public void method1() {
                System.out.println("只重写需要的方法");
            }
        };
        interfaceAdapter.method1();
    }
}
