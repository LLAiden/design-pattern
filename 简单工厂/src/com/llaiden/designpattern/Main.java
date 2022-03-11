package com.llaiden.designpattern;

public class Main {

    public static void main(String[] args) {
        Dog dog = AnimalFactory.createDog();
        dog.name();
    }
}
