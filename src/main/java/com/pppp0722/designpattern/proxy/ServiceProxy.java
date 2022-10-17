package com.pppp0722.designpattern.proxy;

public class ServiceProxy implements Service {

    private final Service service;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        long start = System.currentTimeMillis();
        System.out.println("--시간 측정 시작--");
        service.doSomething();
        System.out.println("--시간 측정 완료 : " + (System.currentTimeMillis() - start) + "ms--");
    }
}
