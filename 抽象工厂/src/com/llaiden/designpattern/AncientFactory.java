package com.llaiden.designpattern;

public class AncientFactory extends AbstractFactory {
    @Override
    Moveable createMoveable() {
        return new Carriage();
    }

    @Override
    Food createFood() {
        return new Flatbread();
    }

    @Override
    Weapon createWeapon() {
        return new LongSword();
    }
}
