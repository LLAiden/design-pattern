package com.llaiden.designpattern;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        MemoManage memoManage = new MemoManage();
        Order order = new Order(UUID.randomUUID().toString(), 1, memoManage);
        //1 下单  2待支付  3已支付,待发货 4运输中
        order.setStatus(2);
        order.setStatus(3);
        order.setStatus(4);
        order.stateProcess();
    }
}
