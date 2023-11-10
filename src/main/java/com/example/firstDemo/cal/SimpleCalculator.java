package com.example.firstDemo.cal;

public class SimpleCalculator {


    public int getFullSalary(int salary, int bonus) {
        return salary + bonus;
    }

    public int gelSalaryWithoutBonus(int salary, int bonus) {
        return salary - bonus;
    }

    public int gelSalaryWithSpecBonus(int salary, int bonus) {
        return salary + salary / bonus;
    }

}
