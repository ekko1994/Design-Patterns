package alex.study.command.concrete;

import alex.study.command.command.Command;
import alex.study.command.receive.LightReceive;

/**
 * 电灯命令类
 * @author zhanghao
 * @date 2020/11/12 11:26
 */
public class LightOnCommand implements Command {

    private LightReceive lightReceive;

    public LightOnCommand(LightReceive lightReceive) {
        this.lightReceive = lightReceive;
    }

    @Override
    public void execute() {
        lightReceive.on();
    }

    @Override
    public void undo() {
        lightReceive.off();
    }
}
