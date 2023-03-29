package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void WhenCountingCashbackFromSeveralThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void WhenCashbackIsNotCredited() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void WhenExactlyThousandIsSpent() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}

