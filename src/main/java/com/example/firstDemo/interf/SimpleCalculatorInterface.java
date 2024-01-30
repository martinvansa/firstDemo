package com.example.firstDemo.interf;

public interface SimpleCalculatorInterface {

    int getFullSalary(int salary, int bonus);

    int gelSalaryWithoutBonus(int salary, int bonus);

    int gelSalaryWithSpecBonus(int salary, int bonus);

    default String getFirstName() {
        return "Tralalal";
    }
}
