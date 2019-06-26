package com.beatricefarias.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class BooksCalculationTest {

    @Mock
    private BooksCalculation booksCalculation;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        booksCalculation = new BooksCalculationImpl(
                new FantasyBook(),
                new RomanceBook(),
                new ScienceFictionBook()
        );
    }

    @Test
    void valid_bookCount() {
        // Assemble

        // Act
        int bookCount = booksCalculation.getBookCount();

        // Assert
        assertEquals(bookCount, 3);
    }

    @Test
    void valid_totalPrice() {
        // Assemble

        // Act
        double totalPrice = booksCalculation.getTotalPrice();

        // Assert
        assertEquals(totalPrice, 70.53);
    }

}