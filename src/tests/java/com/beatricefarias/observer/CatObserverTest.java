package com.beatricefarias.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class CatObserverTest {

    @Mock
    private SimpleCatObserver simpleCatObserver = new SimpleCatObserver();
    @Mock
    private SophisticatedCatObserver sophisticatedCatObserver = new SophisticatedCatObserver();
    private CatObservable catObservable = new CatObservable();

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void valid() {
        // Assemble
        catObservable.addObserver(simpleCatObserver);
        catObservable.addObserver(sophisticatedCatObserver);

        // Act
        catObservable.notifyObservers();

        // Assert
        verify(simpleCatObserver).onDataAvailable("Meow!");
        verify(sophisticatedCatObserver).onDataAvailable("Meow!");
    }

}