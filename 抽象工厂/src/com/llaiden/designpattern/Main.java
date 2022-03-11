package com.llaiden.designpattern;


/**
 * 封装一系列产品的封装过程
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory ancientFactory = new AncientFactory();
        AbstractFactory modernFactory = new ModernFactory();

        System.out.println("李4坐在");
        modernFactory.createMoveable().printName();
        System.out.println("吃着");
        modernFactory.createFood().printName();
        System.out.println("使用");
        modernFactory.createWeapon().printName();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("张3坐在");
        ancientFactory.createMoveable().printName();
        System.out.println("吃着");
        ancientFactory.createFood().printName();
        System.out.println("使用");
        ancientFactory.createWeapon().printName();
    }
}
