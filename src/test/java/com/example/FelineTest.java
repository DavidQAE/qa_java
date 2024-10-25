package com.example;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.*;

import java.util.*;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;



    @Test
    public void getKittensMoreThanOne() {
        Assert.assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void getKittensLessThanOne() {
        Assert.assertEquals(0, feline.getKittens(0));
    }

    @Test
    public void getKittensDefaultValue() {
        Assert.assertEquals(1, feline.getKittens());
    }


    @Test
    public void eatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

}












