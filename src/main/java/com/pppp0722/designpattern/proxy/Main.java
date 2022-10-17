package com.pppp0722.designpattern.proxy;

public class Main {

    public static void main(String[] args) {
        Service helloService = new HelloService();
        Service byeService = new ByeService();
        Service proxyService = new ServiceProxy(helloService);

        proxyService.doSomething();
        proxyService = new ServiceProxy(byeService);
        proxyService.doSomething();
    }
}
