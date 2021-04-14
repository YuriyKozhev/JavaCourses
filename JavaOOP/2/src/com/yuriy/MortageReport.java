package com.yuriy;

import java.text.NumberFormat;

public class MortageReport {

    private static final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

    public static void printMorgage(MortgageCalculator mortgageCalculator) {
        System.out.println("Mortgage");
        System.out.println("________");
        double mortgage = mortgageCalculator.calculateMortgage();
        System.out.println("Monthly Payments: " + currencyInstance.format(mortgage));
    }

    public static void printPaymentSchedule(MortgageCalculator mortgageCalculator) {
        System.out.println("Payment Schedule");
        System.out.println("________");
        for (double balance : mortgageCalculator.getRemainingBalances()) {
            System.out.println(currencyInstance.format(balance));
        }
    }
}
