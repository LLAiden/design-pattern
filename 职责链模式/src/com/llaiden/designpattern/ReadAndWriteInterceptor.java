package com.llaiden.designpattern;

public class ReadAndWriteInterceptor implements Interceptor {

    private Interceptor interceptor;

    public void setInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public void chain() {
        System.out.println("读取服务端返回的数据并写入响应体...");
        if (interceptor != null) {
            interceptor.chain();
        }
    }
}
