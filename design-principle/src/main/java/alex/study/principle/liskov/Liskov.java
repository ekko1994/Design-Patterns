package alex.study.principle.liskov;

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
        // 他的本意是要求10 - 2 +9，但是由于重写了父类的方法，导致结果不是自己想求的结果 10 + 2 + 9
        int j = b.method2(10, 2);
        System.out.println("10 - 2 +9 = " + j);
    }
}

class A {
    // 求两个数的差值
    public int method1(int a, int b) {
        return a - b;
    }
}

/**
 * 新增功能：求两个数的和与9计算
 */
class B extends A {

    // 重写了父类的方法，可能是不小心，无意识的
    @Override
    public int method1(int a, int b) {
        return a + b;
    }

    public int method2(int a, int b) {
        return method1(a, b) + 9;
    }
}

