package com.llaiden.designpattern;

public class ShoeAction extends FigureDecoration {

    public ShoeAction(Action figure) {
        super(figure);
    }

    public ShoeAction(){}

    @Override
    public void performAction() {
        System.out.println("穿上鞋...");
        if (figure != null) {
            figure.performAction();
        }
    }
}
