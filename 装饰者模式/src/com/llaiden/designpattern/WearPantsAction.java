package com.llaiden.designpattern;

public class WearPantsAction extends FigureDecoration {

    public WearPantsAction(Action figure) {
        super(figure);
    }

    @Override
    public void performAction() {
        System.out.println("穿上了裤子...");
        if (figure != null) {
            figure.performAction();
        }
    }
}
