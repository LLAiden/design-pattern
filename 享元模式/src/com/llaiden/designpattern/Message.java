package com.llaiden.designpattern;

public class Message {

    private static Message message;
    private String body;

    public void setBody(String body) {
        this.body = body;
    }

    public static Message get() {
        if (message == null) {
            message = new Message();
            message.body = "Hello";
        } else {
            message.body = null;
        }
        return message;
    }
}

