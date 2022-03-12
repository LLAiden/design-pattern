package com.llaiden.designpattern;

public class Soldier {

    private Person person = new Person("李4", 28, 1);
    private Weapon weapon = new Weapon("AK-47");
    private String rank = "少校";

    @Override
    public String toString() {
        return "Soldier{" +
                "person=" + person +
                ", weapon=" + weapon +
                ", rank='" + rank + '\'' +
                '}';
    }

    public String selfIntroduction() {
        return "我是 " + person.getName() + ", 今年" + person.getAge() + "岁,武器是: " + weapon.getName();
    }
}
