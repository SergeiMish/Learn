package ru.yandex.practicum;


// Дополните класс для проверки возраста пользователя
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }
    public void shouldBeBlockedAfterBlockIsCalled(){

    }
}