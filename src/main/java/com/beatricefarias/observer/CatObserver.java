package com.beatricefarias.observer;

public class CatObserver implements Observer<String> {

    @Override
    public void onDataAvailable(String data) {
        System.out.format("The cat just said %s So adorable.", data);
    }

}
