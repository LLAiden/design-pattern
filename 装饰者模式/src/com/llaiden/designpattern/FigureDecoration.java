package com.llaiden.designpattern;

public class FigureDecoration implements Action {

    protected Action figure;

    public FigureDecoration() {
    }

    public FigureDecoration(Action figure) {
        this.figure = figure;
    }

    @Override
    public void performAction() {
        if (figure != null) {
            figure.performAction();
        }
    }
}
