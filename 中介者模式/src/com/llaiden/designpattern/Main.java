package com.llaiden.designpattern;

/**
 * 中介者模式,处理多个类之间通讯的复杂度同时降低耦合度
 */
public class Main {

    //RealEstateAgent为L4,Z3之间通讯的桥梁,L4,这Z3之间没有耦合
    public static void main(String[] args) {
        Li4 li4 = new Li4();
        li4.sell();

        Z3 z3 = new Z3();
        z3.lookingForARoom();
    }
}
