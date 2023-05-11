package com.example.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class SecondService {

    public String firstMethod(Object object) {
        return object.toString();
    }
    public String secondMethod(Object object) {
        return object.toString();
    }
    public String thirdMethod(String name) {
        return String.format("GoodBye %s!", name);
    }
}
