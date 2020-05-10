package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostControllerTest {
    @Test
    public void PostControllerTest(){

        Details details = Mockito.mock(Details.class);
        when(details.getName()).thenReturn("Koushik123");
        assertEquals(details.getName(), "Koushik123");
    }

}