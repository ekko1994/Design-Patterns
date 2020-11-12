package alex.study.command.client;

import alex.study.command.concrete.LightOffCommand;
import alex.study.command.concrete.LightOnCommand;
import alex.study.command.invoke.RemoteController;
import alex.study.command.receive.LightReceive;

/**
 * @author zhanghao
 * @date 2020/11/12 11:23
 */
public class MainClient {

    public static void main(String[] args) {

        LightReceive lightReceive = new LightReceive();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceive);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceive);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.onButton(0);
        remoteController.offButton(0);
        remoteController.undo();

    }
}
