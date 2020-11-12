package alex.study.command.command;

/**
 * 命令类
 * @author zhanghao
 * @date 2020/11/12 11:25
 */
public interface Command {

    // 执行操作
    void execute();

    // 撤销操作
    void undo();
}
