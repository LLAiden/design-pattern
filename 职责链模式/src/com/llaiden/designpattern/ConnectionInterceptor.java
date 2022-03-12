package com.llaiden.designpattern;

public class ConnectionInterceptor implements Interceptor {

    private Interceptor interceptor;

    public void setInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public void chain() {
        System.out.println("发起网络请求链接服务端...");
        if (interceptor != null) {
            interceptor.chain();
        }
    }
}
