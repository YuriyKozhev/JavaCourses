package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        double monthlyRate = annualRate / PERCENT / MONTH_IN_YEAR;
        double periodMonths = period * MONTH_IN_YEAR;

        double mortgage = principal *
                monthlyRate * Math.pow(1 + monthlyRate, periodMonths) /
                (Math.pow(1 + monthlyRate, periodMonths) - 1);

        System.out.println("Mortgage " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
