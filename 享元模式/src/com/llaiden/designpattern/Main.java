package com.llaiden.designpattern;

/**
 * 享元模式,主要是解决对象的多次创建节约内存
 */
public class Main {

    public static void main(String[] args) {
        Message message1 = Message.get();
        System.out.println(message1.hashCode());
        Message message2 = Message.get();
        System.out.println(message2.hashCode());
        Message message3 = Message.get();
        System.out.println(message3.hashCode());
    }
}
