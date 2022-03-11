package com.llaiden.designpattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectProxy(new RealSubject());
        subject.show();
    }
}
