package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 14;

        String result = "";

        if (number % 5 == 0) {
            result += "Fizz";
        }
        if (number % 3 == 0) {
            result += "Buzz";
        }

        result = result == "" ? Integer.toString(number) : result;
        System.out.println(result);
    }
}
