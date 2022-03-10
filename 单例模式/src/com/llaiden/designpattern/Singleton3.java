package com.llaiden.designpattern;


/**
 * 静态内部类单例
 */
public class Singleton3 {
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return Singleton3Holder.INSTANCE;
    }

    private static class Singleton3Holder {
        static Singleton3 INSTANCE = new Singleton3();
    }
}
