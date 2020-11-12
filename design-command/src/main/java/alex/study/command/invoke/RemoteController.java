package alex.study.command.invoke;

import alex.study.command.command.Command;
import alex.study.command.concrete.NoCommand;

/**
 * 遥控器
 * @author zhanghao
 * @date 2020/11/12 11:23
 */
public class RemoteController {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command noCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 开
    public void onButton(int num){
        onCommands[num].execute();
        noCommand = onCommands[num];
    }

    // 关
    public  void offButton(int num){
        offCommands[num].execute();
        noCommand = offCommands[num];
    }

    // 撤销
    public void undo(){
        noCommand.undo();
    }
}
