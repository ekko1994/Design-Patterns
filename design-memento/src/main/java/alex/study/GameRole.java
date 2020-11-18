package alex.study;

/**
 * @author zhanghao
 * @date 2020/11/17 16:07
 */
public class GameRole {

    // 攻击力
    private int atk;
    // 防御力
    private int def;

    public Memento createMemento(){
        return new Memento(atk,def);
    }

    public void recoverGameRoleFromMemento(Memento memento){
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void display(){
        System.out.println("游戏角色的攻击力：" + this.atk + ", 防御力：" + this.def);
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
