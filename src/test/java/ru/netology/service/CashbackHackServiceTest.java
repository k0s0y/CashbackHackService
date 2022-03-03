package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowBelowBoundary() {
        int purchaseCost = 600;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 400;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldhowHigherBoundary(){
        int purchaseCost = 1300;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 700;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldShowNullBoundary() {
        int purchaseCost = 0;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldShowEqualBoundary() {
        int purchaseCost = 1000;
        int actualResult = service.remain(purchaseCost);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);
    }


}