package com.llaiden.designpattern;

public abstract class AbstractFactory {

    abstract Moveable createMoveable();

    abstract Food createFood();

    abstract Weapon createWeapon();

}
