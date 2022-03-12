package com.llaiden.designpattern;

public class Order {

    private String no;
    private int status;
    private MemoManage memoManage;

    public Order(String no, int status, MemoManage memoManage) {
        this.no = no;
        this.memoManage = memoManage;
        setStatus(status);
    }

    public void setStatus(int status) {
        this.status = status;
        memoManage.add(new Memo(status));
    }

    public void stateProcess() {
        memoManage.stateProcess();
    }
}
