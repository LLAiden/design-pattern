package com.llaiden.designpattern;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Runnable() {
            @Override
            public void run() {
//                System.out.println(Singleton1.getInstance().hashCode());
//                System.out.println(Singleton2.getInstance().hashCode());
//                System.out.println(Singleton3.getInstance().hashCode());
                System.out.println(Singleton4.INSTANCE.hashCode());
            }
        });



    }

    public void run(Runnable runnable) {
        for (int i = 0; i < 1000; i++) {
            runnable.run();
        }
    }
}
