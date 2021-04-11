package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static double readNumber(
            Scanner scanner,
            String prompt,
            double min,
            double max) {
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = readNumber(scanner, "Principal (1K-1M): ", 1_000, 1_000_000);
        double annualRate = readNumber(scanner, "Annual Rate: ", 1, 30);
        int period = (int) readNumber(scanner, "Period: ", 1, 30);

        printMorgage(principal, annualRate, period);

        printPaymentSchedule(principal, annualRate, period);

    }

    public static void printMorgage(double principal, double annualRate, int period) {
        System.out.println("Mortgage");
        System.out.println("________");
        double mortgage = calculateMortgage(principal, annualRate, period);
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    public static void printPaymentSchedule(double principal, double annualRate, int period) {
        System.out.println("Payment Schedule");
        System.out.println("________");
        int periodMonths = calculatePeriodMonths(period);
        for (int i = 1; i <= periodMonths; i++) {
            double balance = calculateBalance(principal, annualRate, periodMonths, i);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double calculateBalance(
            double principal,
            double annualRate,
            int periodMonths,
            int numberOfPaymentsMade) {
        double monthlyRate = calculateMonthlyRate(annualRate);

        return principal
                * (Math.pow(1 + monthlyRate, periodMonths)
                    - Math.pow(1 + monthlyRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyRate, periodMonths) - 1);
    }

    public static double calculateMonthlyRate(double annualRate) {
        return annualRate / PERCENT / MONTH_IN_YEAR;
    }

    public static int calculatePeriodMonths(int period) {
        return period * MONTH_IN_YEAR;
    }

    public static double calculateMortgage(
            double principal,
            double annualRate,
            int period) {
        double monthlyRate = calculateMonthlyRate(annualRate);
        int periodMonths = calculatePeriodMonths(period);

        double mortgage = principal *
                monthlyRate * Math.pow(1 + monthlyRate, periodMonths) /
                (Math.pow(1 + monthlyRate, periodMonths) - 1);

        return mortgage;
    }
}
