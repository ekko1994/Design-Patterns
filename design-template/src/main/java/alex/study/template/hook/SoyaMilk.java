package alex.study.template.hook;

/**
 * 豆浆制作
 * @author zhanghao
 * @date 2020/11/12 10:00
 */
public abstract class SoyaMilk {

    // 模板方法可以为final，不让子类重写
    final void make(){
        select();
        if (customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步：选材");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("第三步：侵泡");
    }

    void beat(){
        System.out.println("第四步：榨汁");
    }

    boolean customerWantCondiments(){
        return true;
    }
}
