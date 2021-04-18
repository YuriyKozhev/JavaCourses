package com.yuriy;

public class Main {

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("a");
        list.add("b");

        for (var item : list) {
            System.out.println(item);
        }
    }
}
