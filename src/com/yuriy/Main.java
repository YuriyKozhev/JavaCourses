package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

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

        double mortgage = calculateMortgage(principal, annualRate, period);

        System.out.println("Mortgage");
        System.out.println("________");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));

        System.out.println("Payment Schedule");
        System.out.println("________");

        double monthlyRate = annualRate / 100 / 12;
        int periodMonths = period * 12;

        for (int i = 1; i <= periodMonths; i++) {
            double B = principal * (Math.pow(1 + monthlyRate, periodMonths)
                    - Math.pow(1 + monthlyRate, i)) / (Math.pow(1 + monthlyRate, periodMonths) - 1);
            System.out.println(NumberFormat.getCurrencyInstance().format(B));
        }
    }

//    public static double calculateMonthlyRate()

    public static double calculateMortgage(
            double principal,
            double annualRate,
            int period) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        double monthlyRate = annualRate / PERCENT / MONTH_IN_YEAR;
        int periodMonths = period * MONTH_IN_YEAR;

        double mortgage = principal *
                monthlyRate * Math.pow(1 + monthlyRate, periodMonths) /
                (Math.pow(1 + monthlyRate, periodMonths) - 1);

        return mortgage;
    }
}
