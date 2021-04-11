package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        double principal;
        while (true) {
            System.out.print("Principal (1K - 1M): ");
            principal = scanner.nextDouble();
            if (principal >= 1_000 &&  principal <= 1_000_000)
                break;
        }

        double annualRate;
        while (true) {
            System.out.print("Annual interest rate: ");
            annualRate = scanner.nextDouble();
            if (annualRate > 0 && annualRate < 30)
                break;
            else
                System.out.println("Enter a value between 0 and 30 excluding 0 and 30");
        }

        int period;
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if (period > 0 && period < 30)
                break;
            else
                System.out.println("Enter a value between 1 and 30");

        }
        double monthlyRate = annualRate / PERCENT / MONTH_IN_YEAR;
        double periodMonths = period * MONTH_IN_YEAR;

        double mortgage = principal *
                monthlyRate * Math.pow(1 + monthlyRate, periodMonths) /
                (Math.pow(1 + monthlyRate, periodMonths) - 1);

        System.out.println("Mortgage " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
