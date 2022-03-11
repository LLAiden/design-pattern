package com.llaiden.designpattern;

public class RealSubject implements Subject {
    @Override
    public void show() {
        System.out.println("应用主题...");
    }
}
