package com.llaiden.designpattern;

public class ClotheAction extends FigureDecoration {

    public ClotheAction(Action figure) {
        super(figure);
    }

    @Override
    public void performAction() {
        System.out.println("穿上了衣服...");
        if (figure != null) {
            figure.performAction();
        }
    }
}
