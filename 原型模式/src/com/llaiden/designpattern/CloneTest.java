package com.llaiden.designpattern;

public class CloneTest implements Cloneable{

    private int i;

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "i=" + i +
                '}';
    }
}
