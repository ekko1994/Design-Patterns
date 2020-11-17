package alex.stuudy.mediator;

/**
 * @author zhanghao
 * @date 2020/11/17 10:54
 */
public class User {

    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        this.chatRoom.showMessage(this,message);
    }
}
