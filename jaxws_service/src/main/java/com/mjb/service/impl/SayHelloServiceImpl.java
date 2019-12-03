package com.mjb.service.impl;

import com.mjb.service.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String arg) {
        return arg + "你好！";
    }


}
