package com.llaiden.designpattern;


/**
 * 构造者模式
 *      1.简化一个对象的初始化过程
 *      2.对象初始化完成后可关闭对属性的修改的通道
 */
public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker);
        Worker worker1 = new Worker.Builder()
                .setAge("22")
                .setGender("女")
                .setSalary("9999")
                .setName("Jane")
                .build();
        System.out.println(worker1);
    }
}
