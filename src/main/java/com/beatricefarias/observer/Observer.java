package com.beatricefarias.observer;

public interface Observer<T> {

    void onDataAvailable(T data);

}
