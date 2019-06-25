package com.beatricefarias.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    private String name = "Fluffy";
    private int age = 10;
    private CatBreed breed = CatBreed.MIXED;
    private CatFurColor furColor = CatFurColor.GINGER;
    private CatPersonality personality = CatPersonality.PLAYFUL;

    @Test
    void valid_allFields() {
        // Assemble
        // Act
        Cat cat = new Cat.Builder()
                .setName(name)
                .setAge(age)
                .setBreed(breed)
                .setFurColor(furColor)
                .setPersonality(personality)
                .build();

        // Assert
        assertEquals(cat.getName(), name);
        assertEquals(cat.getAge(), age);
        assertEquals(cat.getBreed(), breed);
        assertEquals(cat.getFurColor(), furColor);
        assertEquals(cat.getPersonality(), personality);
    }

    @Test
    void valid_partialFilledFields() {
        // Assemble
        // Act
        Cat cat = new Cat.Builder()
                .setName(name)
                .setAge(age)
                .build();

        // Assert
        assertEquals(cat.getName(), name);
        assertEquals(cat.getAge(), age);
        assertEquals(cat.getBreed(), CatBreed.UNKNOWN);
        assertEquals(cat.getFurColor(), CatFurColor.UNKNOWN);
        assertEquals(cat.getPersonality(), CatPersonality.UNKNOWN);
    }

    @Test
    void valid_fieldsInMixedOrder() {
        // Assemble
        // Act
        Cat cat = new Cat.Builder()
                .setAge(age)
                .setFurColor(furColor)
                .setBreed(breed)
                .setPersonality(personality)
                .setName(name)
                .build();

        // Assert
        assertEquals(cat.getName(), name);
        assertEquals(cat.getAge(), age);
        assertEquals(cat.getBreed(), breed);
        assertEquals(cat.getFurColor(), furColor);
        assertEquals(cat.getPersonality(), personality);
    }
    
}
