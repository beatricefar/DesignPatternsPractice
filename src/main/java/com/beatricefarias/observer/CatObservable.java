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
        for (int i = 0; i < catObservers.size(); i++) {
            catObservers.get(i).onDataAvailable(String.format("Mew %d!", i));
        }
    }
}
