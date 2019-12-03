package com.mjb.service;

import javax.jws.WebService;

@WebService
public interface SayHelloService {

    public String sayHello(String arg);
}
