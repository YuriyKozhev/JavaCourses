package com.yuriy;

import java.text.NumberFormat;
import java.util.Scanner;

public class Console {
    private final static Scanner scanner = new Scanner(System.in);

    public static double readNumber(
            String prompt,
            double min,
            double max
    ) {
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
        }

        return value;
    }

}
