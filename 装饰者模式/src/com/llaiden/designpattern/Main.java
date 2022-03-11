package com.llaiden.designpattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("李4");
        Action action = new ShoeAction();
        action = new WearPantsAction(action);
        action = new ClotheAction(action);
        action = new FigureDecoration(action);
        action.performAction();
        System.out.println("出门了");
    }
}
