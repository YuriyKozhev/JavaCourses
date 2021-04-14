package com.yuriy;

import java.text.NumberFormat;

public class MortageReport {
    public static void printMorgage(MortgageCalculator mortgageCalculator) {
        System.out.println("Mortgage");
        System.out.println("________");
        double mortgage = mortgageCalculator.calculateMortgage();
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    public static void printPaymentSchedule(MortgageCalculator mortgageCalculator) {
        System.out.println("Payment Schedule");
        System.out.println("________");
        for (int i = 1; i <= mortgageCalculator.getPeriodMonths(); i++) {
            double balance = mortgageCalculator.calculateBalance(i);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
