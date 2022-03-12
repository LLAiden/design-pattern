package com.llaiden.designpattern;

public class Mansion implements RealEstate {

    @Override
    public int area() {
        return 800;
    }

    @Override
    public void areaPrint() {
        System.out.println("800平豪宅");
    }

    @Override
    public void unitPrice() {
        System.out.println("单价: 18000");
    }

    @Override
    public boolean isSell() {
        return true;
    }
}
