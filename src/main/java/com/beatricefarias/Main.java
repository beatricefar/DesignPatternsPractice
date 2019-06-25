package com.beatricefarias;

import com.beatricefarias.builder.Cat;
import com.beatricefarias.builder.CatFurColor;
import com.beatricefarias.builder.CatPersonality;
import com.beatricefarias.observer.CatObservable;
import com.beatricefarias.observer.CatObserver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cat cat = createCat();
        System.out.format(
                "Cat name is %s , age %d , breed %s , color %s and it is %s .",
                cat.getName(),
                cat.getAge(),
                cat.getBreed(),
                cat.getFurColor(),
                cat.getPersonality()
        );

        observeTheKittens();
    }

    private static Cat createCat() {
        return new Cat.Builder()
                .setName("Fluffy")
                .setAge(10)
                .setFurColor(CatFurColor.GINGER)
                .setPersonality(CatPersonality.PLAYFUL)
                .build();
    }

    private static void observeTheKittens() {
        CatObservable catObservable = new CatObservable();
        CatObserver catObserver1 = new CatObserver();
        CatObserver catObserver2 = new CatObserver();

        catObservable.addObserver(catObserver1);
        catObservable.addObserver(catObserver2);

        catObservable.notifyObservers();
    }

}
