package ru.yandex.practicum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 0) < 0);
    }
    @Test
    public void shouldReturn200ForBikeAndDistanceIs20Km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.calculatePrice(TransportType.BIKE, 20);
        assertEquals(200, price);
    }
    @Test
    public void  shouldBeNegativeWhenBikeAndDistanceIs25Km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertFalse(priceCalculator.calculatePrice(TransportType.BIKE, 25) >= 20);
    }
    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.CAR, 0) < 0);
    }
    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        Assertions.assertFalse(priceCalculator.calculatePrice(TransportType.CAR, 1001) >= 1000);
    }
    @Test
    public void shouldReturn3885ForCarAndDistanceIs555Km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.calculatePrice(TransportType.CAR, 555);
        assertEquals(3885, price);
    }
    @Test
    public void shouldReturn50000ForTruckAndDistanceIs10000Km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.calculatePrice(TransportType.TRUCK, 10000);
        assertEquals(50000, price);
    }
    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.TRUCK, 0) < 0);
    }
@Test
    public void shouldBeNegativeWhenDroneAndDistanceIs0Km() {
    Assertions.assertNull(priceCalculator.calculatePrice(TransportType.DRONE, 0));
    }
}