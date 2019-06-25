package com.beatricefarias.observer;

import java.util.ArrayList;
import java.util.List;

public class CatObservable implements Observable<String> {

    private List<Observer<String>> catObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer<String> catObserver) {
        catObservers.add(catObserver);
    }

    @Override
    public void notifyObservers() {
        for (Observer<String> catObserver: catObservers) {
            catObserver.onDataAvailable("Meow!");
        }
    }
}
