package com.example.demo1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
class MainServiceTest {

    @Autowired
    private MainService mainService;

    @MockBean
    private SecondService secondService;

    @Test
    void sayHello() {
        String sofia = mainService.sayHello("Sofia");
        Assertions.assertEquals("Hello Sofia!", sofia);
    }

    @Test
    void sayGoodbye() {
        when(secondService.thirdMethod(anyString()))
                .thenReturn("Goodbye Sofia!!!");

        String sofia = mainService.sayGoodBye("Sofia");
        Assertions.assertEquals("Goodbye Sofia!!!", sofia);
    }
}