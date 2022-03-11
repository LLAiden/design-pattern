package com.llaiden.designpattern;

public class SubjectProxy implements Subject {

    private Subject realSubject;

    public SubjectProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void show() {
        System.out.println("清除之前主题...");
        realSubject.show();
        System.out.println("应用新主题完成...");
    }
}
