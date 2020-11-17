package alex.stuudy.mediator;

/**
 * @author zhanghao
 * @date 2020/11/17 10:58
 */
public class MainClient {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User tom = new User("tom",chatRoom);
        User jack = new User("jack",chatRoom);

        tom.sendMessage("hello");
        jack.sendMessage("nihao");
    }
}
