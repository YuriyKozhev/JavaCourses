package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double income = 120_000;
        String isHigh = income > 100_000 ? "Yes" : "No";
        System.out.println(isHigh);
    }
}
