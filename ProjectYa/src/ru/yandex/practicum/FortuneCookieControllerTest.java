package ru.yandex.practicum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieControllerTest {

    private FortuneCookieFactory goodFactory;
    private FortuneCookieFactory badFactory;

    @BeforeEach
    public void setUp() {
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");

        FortuneConfig goodConfig = new FortuneConfig(true);
        FortuneConfig badConfig = new FortuneConfig(false);

        goodFactory = new FortuneCookieFactory(goodConfig, positive, negative);
        badFactory = new FortuneCookieFactory(badConfig, positive, negative);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        FortuneCookie cookie = goodFactory.bakeFortuneCookie();
        assertEquals("positive", cookie.getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        FortuneCookie cookie = badFactory.bakeFortuneCookie();
        assertEquals("negative", cookie.getFortuneText());
    }
}


