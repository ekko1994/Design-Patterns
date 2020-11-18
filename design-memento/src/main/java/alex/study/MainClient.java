package alex.study;

/**
 * @author zhanghao
 * @date 2020/11/17 16:00
 */
public class MainClient {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setAtk(100);
        gameRole.setDef(100);

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        gameRole.setAtk(30);
        gameRole.setDef(30);
        gameRole.display();

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());

        gameRole.display();
    }
}
