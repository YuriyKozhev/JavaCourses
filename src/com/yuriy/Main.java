package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double income = 120_000;
        String isHigh = income > 100_000 ? "Yes" : "No";
        System.out.println(isHigh);
        if (isHigh == "Yes") {
            System.out.println("High");
        } else if (isHigh == "No") {
            System.out.println("Not High");
        } else {
            System.out.println("What?");
        }

        switch (isHigh) {
            case "Yes":
                System.out.println("High");
                break;
            case "No":
                System.out.println("Not High");
                break;
            default:
                System.out.println("What?");
        }
    }
}
