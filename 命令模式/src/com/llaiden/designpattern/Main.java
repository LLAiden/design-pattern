package com.llaiden.designpattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RemoteControl remoteControl = new RemoteControl(new LightCommand());
        remoteControl.press();
        Thread.sleep(1000);
        remoteControl.press();
    }
}
