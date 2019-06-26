package com.beatricefarias;

import com.beatricefarias.builder.Cat;
import com.beatricefarias.builder.CatFurColor;
import com.beatricefarias.builder.CatPersonality;
import com.beatricefarias.chainofresponsibility.LogManager;
import com.beatricefarias.chainofresponsibility.LogType;
import com.beatricefarias.facade.*;
import com.beatricefarias.observer.CatObservable;
import com.beatricefarias.observer.SimpleCatObserver;
import com.beatricefarias.observer.SophisticatedCatObserver;

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

        logMessages();

        buyBooks();
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
        SimpleCatObserver simpleCatObserver = new SimpleCatObserver();
        SophisticatedCatObserver sophisticatedCatObserver = new SophisticatedCatObserver();

        catObservable.addObserver(simpleCatObserver);
        catObservable.addObserver(sophisticatedCatObserver);

        catObservable.notifyObservers();
    }

    private static void logMessages() {
        new LogManager().logChain(LogType.DEBUG.getLogType());
    }

    private static void buyBooks() {
        BooksCalculation booksCalculation = new BooksCalculationImpl(
                new FantasyBook(),
                new RomanceBook(),
                new ScienceFictionBook()
        );

        System.out.format("Book count: %d", booksCalculation.getBookCount());
        System.out.format("Books cost: %.2f", booksCalculation.getTotalPrice());
    }

}
