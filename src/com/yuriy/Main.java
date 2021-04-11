package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name > ");
        String firstName = scanner.next();
        String secondName = scanner.next();
        String name = firstName + secondName;
        System.out.println("name is " + name);
    }
}
