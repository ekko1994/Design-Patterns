package alex.study;

/**
 * @author zhanghao
 * @date 2020/11/17 16:05
 */
public class Caretaker {

    //如果只保存一次状态
    private Memento	memento;
    //对 GameRole 保存多次状态
    //private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    //private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
