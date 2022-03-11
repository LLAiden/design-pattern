package com.llaiden.designpattern;

/**
 * 封装对象创建的过程
 */
public class AnimalFactory {
    public static Dog createDog() {
        System.out.println("create dog...");
        return new Dog();
    }
}
