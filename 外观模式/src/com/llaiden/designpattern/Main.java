package com.llaiden.designpattern;

/**
 * 外观模式将一些列操作封装起来,方便统一调用,只关注结果
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new DevWorker();
        worker.goToWork();
    }
}
