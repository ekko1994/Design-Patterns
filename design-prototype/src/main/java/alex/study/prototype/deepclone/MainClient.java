package alex.study.prototype.deepclone;

/**
 * @author zhanghao
 * @date 2020/9/29 15:16
 */
public class MainClient {

    public static void main(String[] args) {

        /*try {
            DeepPrototype deepPrototype = new DeepPrototype("aa", new DeepCloneableTarget("aaa", "bbb"));
            DeepPrototype clone = (DeepPrototype) deepPrototype.clone();

            System.out.println(deepPrototype);
            System.out.println(clone);
            System.out.println(deepPrototype.hashCode());
            System.out.println(clone.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        DeepPrototype deepPrototype = new DeepPrototype("rr", new DeepCloneableTarget("ss", "gg"));
        DeepPrototype clone = (DeepPrototype) deepPrototype.deepClone();

        System.out.println(deepPrototype);
        System.out.println(clone);
        System.out.println(deepPrototype.hashCode());
        System.out.println(clone.hashCode());
    }
}
