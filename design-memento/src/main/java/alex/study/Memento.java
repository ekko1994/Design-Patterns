package alex.study;

/**
 * @author zhanghao
 * @date 2020/11/17 16:00
 */
public class Memento {

    // 攻击力
    private int atk;
    // 防御力
    private int def;

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

    public Memento(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }
}
