package com.llaiden.designpattern;

/**
 * 模板方法,在Android中通常BaseActivity就是这么处理
 */
public class Main {

    public static void main(String[] args) {
        BaseActivity baseActivity = new Activity();
        baseActivity.onCreate();
    }
}
