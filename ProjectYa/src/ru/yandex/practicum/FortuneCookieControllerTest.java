package ru.yandex.practicum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieControllerTest {

    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    public static void setUp() {
        goodFactoryController = create(true);
        badFactoryController = create(false);
    }

    private static FortuneCookieController create(boolean isPositive) {
        FortuneConfig config = new FortuneConfig(isPositive);
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");
        FortuneCookieFactory factory = new FortuneCookieFactory(config, positive, negative);
        return new FortuneCookieController(factory);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        String fortune = goodFactoryController.getFortune();
        assertEquals("positive", fortune);
    }

    @Test
    public void shouldReturnNegativeFortune() {
        String fortune = badFactoryController.getFortune();
        assertEquals("negative", fortune);
    }
}


