package com.llaiden.designpattern;

import java.util.ArrayList;
import java.util.List;

public enum RealEstateAgent {
    INSTANCE;

    final List<RealEstate> estateList = new ArrayList<>();

    public void postAHouse(RealEstate mansion) {
        estateList.add(mansion);
    }

    public void lookingForAHouse(int area) {
        for (RealEstate realEstate : estateList) {
            if (realEstate.area() > area) {
                System.out.println("找到大于: " + area + "房子");
            }
        }
    }
}

