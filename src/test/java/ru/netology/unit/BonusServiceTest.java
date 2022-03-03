package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class BonusServiceTest {

    @Test
    public void shouldCalculateBonus() {
        BonusService bonusService = new BonusService();
        long amount = 20000;
        int expected = 6;

        long actual = bonusService.calculate(amount, true);
        assertEquals(expected, actual);
    }
}