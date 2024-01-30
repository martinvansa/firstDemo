package com.example.firstDemo.service;

import org.springframework.stereotype.Service;

import com.example.firstDemo.interf.SimpleCalculatorInterface;

@Service
public class SimpleCalculator implements SimpleCalculatorInterface {

    @Override
    public int getFullSalary(int salary, int bonus) {
        return salary + bonus;
    }

    @Override
    public int gelSalaryWithoutBonus(int salary, int bonus) {
        return salary - bonus;
    }

    @Override
    public int gelSalaryWithSpecBonus(int salary, int bonus) {
        return salary + salary / bonus;
    }
    
}
