package com.llaiden.designpattern;


/**
 * 饿汉式单例
 * 优点:
 *      1.类加载时构建对象由JVM保证线程按钮
 * 缺点
 *      1.加载类时直接实例化对象可能造成内存浪费
 */
public class Singleton1 {

    private static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
