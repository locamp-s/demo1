package com.example.demo1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MainServiceTest {

    @Test
    void sayHello() {
        SecondService secondServiceMock = mock(SecondService.class);

        MainService mainService = new MainService(secondServiceMock);
        String sofia = mainService.sayHello("Sofia");

        Assertions.assertEquals("Hello Sofia!", sofia);
    }

    @Test
    void sayGoodbye() {
        SecondService secondServiceMock = mock(SecondService.class);

        when(secondServiceMock.thirdMethod(anyString()))
                .thenReturn("Goodbye Sofia!");

        MainService mainService = new MainService(secondServiceMock);
        String sofia = mainService.sayGoodBye("Sofia");

        Assertions.assertEquals("Goodbye Sofia!", sofia);
    }
}