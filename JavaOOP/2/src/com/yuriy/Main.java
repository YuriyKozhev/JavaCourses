package com.yuriy;

public class Main {
    public static void main(String[] args) {
        double principal = Console.readNumber("Principal (1K-1M): ", 1_000, 1_000_000);
        double annualRate = Console.readNumber( "Annual Rate: ", 1, 30);
        int period = (int) Console.readNumber("Period: ", 1, 30);

        MortgageCalculator mortgageCalculator = new MortgageCalculator(principal, annualRate, period);

        MortageReport.printMortgage(mortgageCalculator);
        MortageReport.printPaymentSchedule(mortgageCalculator);
    }
}
