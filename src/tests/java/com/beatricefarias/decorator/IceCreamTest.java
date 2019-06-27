package com.beatricefarias.decorator;

import org.junit.jupiter.api.Test;

import static com.beatricefarias.decorator.Prices.CHOCOLATE_SYRUP;
import static com.beatricefarias.decorator.Prices.OREO;
import static com.beatricefarias.decorator.Prices.STRAWBERIES;
import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void valid_iceCream_noToppings() {
        // Assemble
        double expectedPrice = IceCreamType.VANILLA.priceCoefficientWithScoopCount(ScoopCount.ONE);

        // Act
        IceCream iceCream = new VanillaIceCream(ScoopCount.ONE);

        // Assert
        assertEquals(expectedPrice, iceCream.getPrice());
    }

    @Test
    void valid_iceCream_oneTopping() {
        // Assemble
        double expectedPrice = IceCreamType.MANGO.priceCoefficientWithScoopCount(ScoopCount.TWO)
                + CHOCOLATE_SYRUP.getPrice();

        // Act
        IceCream iceCream = new ChocolateSyrup(
                new MangoIceCream(ScoopCount.TWO)
        );

        // Assert
        assertEquals(expectedPrice, iceCream.getPrice());
    }

    @Test
    void valid_iceCream_allToppings() {
        // Assemble
        double expectedPrice = IceCreamType.CHOCOLATE.priceCoefficientWithScoopCount(ScoopCount.THREE)
                + CHOCOLATE_SYRUP.getPrice()
                + STRAWBERIES.getPrice()
                + OREO.getPrice();

        // Act
        IceCream iceCream = new ChocolateSyrup(
                new Strawberries(
                        new Oreo(
                                new ChocolateIceCream(ScoopCount.THREE)
                        )
                )
        );

        // Assert
        assertEquals(expectedPrice, iceCream.getPrice());
    }

}