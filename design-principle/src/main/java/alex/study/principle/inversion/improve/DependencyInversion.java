package alex.study.principle.inversion.improve;

/**
 * @author zhanghao
 * @date 2020/9/24 09:39
 */
public class DependencyInversion {

    public static void main(String[] args) {

        // 客户端无需做出改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}

class WeiXin implements IReceiver {

    public String getInfo() {
        return "微信消息：hello";
    }
}

class Email implements IReceiver {

    public String getInfo() {
        return "电子邮件：hello";
    }
}

class Person {

    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

interface IReceiver {

    String getInfo();
}
