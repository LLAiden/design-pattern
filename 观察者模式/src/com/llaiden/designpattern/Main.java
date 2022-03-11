package com.llaiden.designpattern;

public class Main {

    public static void main(String[] args) {
        MessageSendingEquipment messageSendingEquipment = new MessageSendingEquipment();
        messageSendingEquipment.addObserver(message -> System.out.println("1: " + message.getString()));
        messageSendingEquipment.addObserver(message -> System.out.println("2: " + message.getString()));
        messageSendingEquipment.addObserver(message -> System.out.println("3: " + message.getString()));
        Message message = new Message();
        message.setString("Hello observer");
        messageSendingEquipment.sendMessage(message);

    }
}
