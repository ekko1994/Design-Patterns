package alex.study.principle.liskov.improve;

/**
 * @author zhanghao
 * @date 2020/9/24 13:38
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        int i = a.method1(10, 2);
        System.out.println("10 - 2 = " + i);

        B b = new B();
        int j = b.method2(10, 2);
        System.out.println("10 + 2 + 9 = " + j);
        // 可以调用A类的方法
        int k = b.method3(10, 2);
        System.out.println("10 - 2 = " + k);
    }
}

class Base {

}

class A extends Base {
    // 求两个数的差值
    public int method1(int a, int b) {
        return a - b;
    }
}

/**
 * 新增功能：求两个数的和与9计算
 */
class B extends Base {

    // B类要使用A类的方法，组合关系
    private A a = new A();

    public int method1(int a, int b) {
        return a + b;
    }

    public int method2(int a, int b) {
        return method1(a, b) + 9;
    }


    public int method3(int a, int b){
        // 可以使用A类的方法
        return this.a.method1(a,b);
    }
}

