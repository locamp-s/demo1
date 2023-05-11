package com.example.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final SecondService secondService;

    public MainService(SecondService secondService) {
        this.secondService = secondService;
    }

    public String sayHello(String name) {
        return String.format("Hello %s!", name);
    }

    public String sayGoodBye(String name) {
        return secondService.thirdMethod(name);
    }
}
