package com.llaiden.designpattern;

public class ModernFactory extends AbstractFactory {


    @Override
    Moveable createMoveable() {
        return new Car();
    }

    @Override
    Food createFood() {
        return new Cheese();
    }

    @Override
    Weapon createWeapon() {
        return new HotWeapon();
    }
}
