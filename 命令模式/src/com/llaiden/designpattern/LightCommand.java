package com.llaiden.designpattern;

public class LightCommand implements Command {

    int count = 0;

    @Override
    public void open() {
        System.out.println("开灯...");
        count++;
    }

    @Override
    public void close() {
        System.out.println("关灯...");
        count++;
    }

    @Override
    public boolean press() {
        return count % 2 == 0;
    }
}
