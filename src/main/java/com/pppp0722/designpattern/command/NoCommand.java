package com.pppp0722.designpattern.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        // no-op
    }

    @Override
    public void undo() {
        // no-op
    }
}
