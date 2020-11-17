package alex.stuudy.mediator;

/**
 * @author zhanghao
 * @date 2020/11/17 10:55
 */
public class ChatRoom {

    public void showMessage(User user,String message){
        System.out.println(user.getName() + " " + message);
    }
}
