package com.my.starter;

public class HelloService {

    private HelloProperties helloProperties;

    public HelloService(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name) {
        return helloProperties.getPrefix() + "Hello " + name + helloProperties.getSuffix();
    }
}
