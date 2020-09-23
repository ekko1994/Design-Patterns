package alex.study.principle.segregation.improve;

/**
 * @author zhanghao
 * @date 2020/9/23 11:31
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        a.run1(new B());
        a.run2(new B());
        a.run3(new B());

        C c = new C();
        c.run1(new D());
        c.run4(new D());
        c.run5(new D());
    }
}

class A {
    public void run1(Interface1 i) {
        i.operation1();
    }

    public void run2(Interface2 i) {
        i.operation2();
    }

    public void run3(Interface2 i) {
        i.operation3();
    }
}

class C {
    public void run1(Interface1 i) {
        i.operation1();
    }

    public void run4(Interface3 i) {
        i.operation4();
    }

    public void run5(Interface3 i) {
        i.operation5();
    }
}

class B implements Interface1, Interface2 {

    public void operation1() {
        System.out.println("B 实现 operation1");
    }

    public void operation2() {
        System.out.println("B 实现 operation2");
    }

    public void operation3() {
        System.out.println("B 实现 operation3");
    }
}

class D implements Interface1, Interface3 {

    public void operation1() {
        System.out.println("D 实现 operation1");
    }

    public void operation4() {
        System.out.println("D 实现 operation4");
    }

    public void operation5() {
        System.out.println("D 实现 operation5");
    }
}

interface Interface1 {

    void operation1();
}

interface Interface2 {

    void operation2();

    void operation3();
}

interface Interface3 {

    void operation4();

    void operation5();
}

