package com.llaiden.designpattern;

public class Memo {

    private int status;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public Memo(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        //1 下单  2待支付  3已支付,待发货 4运输中
        String str = null;
        switch (status) {
            case 1:
                str = "下单";
                break;
            case 2:
                str = "待支付";
                break;
            case 3:
                str = "已支付,待发货";
                break;
            case 4:
                str = "运输中";
                break;
        }
        return str;
    }
}
