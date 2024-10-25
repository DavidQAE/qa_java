package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {
    private String animalKind;
    private List expected;

    public AnimalTest(List expected, String animalKind) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> getOrderInformation() {
        return Arrays.asList(new Object[][]{

                {List.of("Трава", "Различные растения"), "Травоядное"},
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"},



        });
    }

    @Test(expected = Exception.class)
    public void testGetFood() throws Exception {
        Animal animal = new Animal();

        animal.getFood("Неизвестно");

    }

    @Test
    public void testGetFoodNoException() throws Exception {
        Animal animal = new Animal();

        Assert.assertEquals(expected, animal.getFood(animalKind));



    }
    }


