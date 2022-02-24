package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateBonus() {
        BonusService bonusService = new BonusService();
        long amount = 20000;
        int expected = 6;

        long actual = bonusService.calculate(amount, true);
        assertEquals(expected,actual, "Wrong bonus calculated");
    }
}