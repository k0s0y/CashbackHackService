package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowBelowBoundary() {
        int purchaseCost = 600;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 400;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldhowHigherBoundary() {
        int purchaseCost = 1300;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 700;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldShowNullBoundary() {
        int purchaseCost = 0;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 1000;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldShowEqualBoundary() {
        int purchaseCost = 1000;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 1000;
        assertEquals(expectedResult, actualResult);
    }


}