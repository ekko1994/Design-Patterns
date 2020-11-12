package alex.study.command.concrete;

import alex.study.command.command.Command;
import alex.study.command.receive.LightReceive;

/**
 * @author zhanghao
 * @date 2020/11/12 13:38
 */
public class LightOffCommand implements Command {

    private LightReceive lightReceive;

    public LightOffCommand(LightReceive lightReceive) {
        this.lightReceive = lightReceive;
    }

    @Override
    public void execute() {
        lightReceive.off();
    }

    @Override
    public void undo() {
        lightReceive.on();
    }
}
