package com.yuriy;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(0);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}
