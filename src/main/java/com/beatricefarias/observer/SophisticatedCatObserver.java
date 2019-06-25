package com.beatricefarias.observer;

public class SophisticatedCatObserver implements Observer<String> {

    @Override
    public void onDataAvailable(String data) {
        System.out.format("The cat just annouced itself by saying %s So sophisticated.", data);
    }

}
