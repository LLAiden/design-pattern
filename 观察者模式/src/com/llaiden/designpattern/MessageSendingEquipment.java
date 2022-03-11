package com.llaiden.designpattern;

import java.util.ArrayList;
import java.util.List;

public class MessageSendingEquipment {

    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void sendMessage(Message message) {
        for (Observer observer : observerList) {
            observer.change(message);
        }
    }
}
