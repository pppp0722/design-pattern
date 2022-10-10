package com.pppp0722.designpattern.command;

public class RemoteControl {

    private static final int COMMAND_NUM = 3;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[COMMAND_NUM];
        offCommands = new Command[COMMAND_NUM];
        for (int i = 0; i < COMMAND_NUM; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int idx, Command onCommand, Command offCommand) {
        onCommands[idx] = onCommand;
        offCommands[idx] = offCommand;
    }

    public void onBtnPressed(int idx) {
        Command onCommand = onCommands[idx];
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offBtnPressed(int idx) {
        Command offCommand = offCommands[idx];
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void undoBtnPressed() {
        undoCommand.undo();
    }
}
