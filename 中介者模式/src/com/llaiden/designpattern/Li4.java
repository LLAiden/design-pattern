package com.llaiden.designpattern;

public class Li4 {

    private RealEstate mansion = new Mansion();

    public void sell(){
        RealEstateAgent.INSTANCE.postAHouse(mansion);
    }
}
