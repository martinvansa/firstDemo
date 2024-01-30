package com.example.firstDemo.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

    @Test
    void salaryPlusBonus() {
        var calculator = new SimpleCalculator();
        assertEquals(450, calculator.getFullSalary(400, 50));
    }

    @Test
    void salaryPlusBonusIsTrue() {
        var calculator = new SimpleCalculator();
        assertTrue(calculator.getFullSalary(400, 50) == 450);
    }

    @Test
    void SalaryWithoutBonu() {
        var calculator = new SimpleCalculator();
        assertEquals(350, calculator.gelSalaryWithoutBonus(400, 50));
    }

    @Test
    void SalaryWithSpecBonus() {
        var calculator = new SimpleCalculator();
        assertEquals(440, calculator.gelSalaryWithSpecBonus(400, 10));
    }
}