package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Arrays.stream(fruits).forEach(fruit -> System.out.println(fruit));

    }
}
