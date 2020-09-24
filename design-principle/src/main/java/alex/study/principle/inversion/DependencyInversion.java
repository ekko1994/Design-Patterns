package alex.study.principle.inversion;

/**
 * @author zhanghao
 * @date 2020/9/24 09:39
 */
public class DependencyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
    }

}

class Email {

    public String getInfo() {
        return "电子邮件：hello";
    }
}

/**
 * 分析：
 * 1、简单容易想到
 * 2、如果要接收的是短信，微信消息呢？增加相应的类，同时在Person种添加接收对应消息的方法
 * 3、解决：抽取接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖。微信，邮件，短信等类实现接口IReceiver,这样符合依赖倒转原则
 */
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
