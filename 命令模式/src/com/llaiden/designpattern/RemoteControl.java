package com.llaiden.designpattern;

public class RemoteControl {

    private final Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void press() {
        if (command.press()) {
            command.open();
        } else {
            command.close();
        }
    }
}
