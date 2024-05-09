package ru.netology.services.rascetotpuska;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCalculationTest {

    @Test
    public void testSmallThresholdMoney() {
        VacationCalculation service = new VacationCalculation();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMaximumThresholdMoney() {
        VacationCalculation service = new VacationCalculation();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }
}

