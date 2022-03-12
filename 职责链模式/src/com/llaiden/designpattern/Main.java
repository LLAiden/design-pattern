package com.llaiden.designpattern;

/**
 * 职责链模式 ,将一个业务清晰的分成多端,每个拦截器中负责自己的逻辑一环扣一环.详情参考okhhtp源码
 */
public class Main {
    public static void main(String[] args) {
        ConnectionInterceptor connectionInterceptor = new ConnectionInterceptor();
        connectionInterceptor.setInterceptor(new ReadAndWriteInterceptor());
        connectionInterceptor.chain();
    }
}
