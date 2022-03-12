package com.llaiden.designpattern;

public abstract class BaseActivity {

    public void onCreate() {
        initAccount();
        loadUserData();
        interfaceRendering();
    }

    private void interfaceRendering() {
        System.out.println("界面渲染...");
    }

    protected abstract void loadUserData();

    private void initAccount() {
        System.out.println("初始化账号...");
    }

}
