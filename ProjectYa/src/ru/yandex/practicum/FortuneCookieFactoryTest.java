package ru.yandex.practicum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class FortuneCookieFactoryTest {

    private FortuneCookieFactory factory;

    @BeforeEach
    public void setUp() {
        FortuneConfig config = new FortuneConfig(true);
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");
        factory = new FortuneCookieFactory(config, positive, negative);
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        factory.bakeFortuneCookie();
        factory.bakeFortuneCookie();
        assertEquals(2, factory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());
        factory.resetCookiesCreated();
        assertEquals(0, factory.getCookiesBaked());
    }
}
