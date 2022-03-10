package com.llaiden.designpattern;


/**
 * 懒汉式单例
 */
public class Singleton2 {
    //加入volatile禁止指令重排序拿到半实例化对象
    private volatile static Singleton2 INSTANCE;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}
