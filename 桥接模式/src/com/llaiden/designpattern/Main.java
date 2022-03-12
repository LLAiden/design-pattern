package com.llaiden.designpattern;

/**
 * 桥接模式类似与代理模式,作用与抽象与实现解耦
 */
public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
