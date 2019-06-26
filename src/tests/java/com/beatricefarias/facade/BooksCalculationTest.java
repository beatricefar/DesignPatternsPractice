package com.beatricefarias.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BooksCalculationTest {

    @Mock
    private BooksCalculation booksCalculation;
    private FantasyBook fantasyBook = new FantasyBook();
    private RomanceBook romanceBook = new RomanceBook();
    private ScienceFictionBook scienceFictionBook = new ScienceFictionBook();

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        booksCalculation = new BooksCalculationImpl(
                fantasyBook,
                romanceBook,
                scienceFictionBook
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
        double expectedPrice = fantasyBook.getBookPrice() + romanceBook.getBookPrice() + scienceFictionBook.getBookPrice();
        double expectedPriceDecimal = new BigDecimal(expectedPrice)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();

        // Act
        double totalPrice = booksCalculation.getTotalPrice();

        // Assert
        assertEquals(totalPrice, expectedPriceDecimal);
    }

}