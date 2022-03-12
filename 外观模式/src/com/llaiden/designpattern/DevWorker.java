package com.llaiden.designpattern;

public class DevWorker implements Worker {
    @Override
    public void goToWork() {
        clothe();
        brushTeeth();
        washYourFace();
        go2Work();
    }

    private void go2Work() {
        System.out.println("出门上班...");
    }

    private void clothe() {
        System.out.println("穿衣服裤子...");
    }

    private void brushTeeth() {
        System.out.println("刷牙...");
    }

    private void washYourFace() {
        System.out.println("洗脸...");
    }
}
