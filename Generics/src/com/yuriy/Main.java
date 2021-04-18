package com.yuriy;

public class Main {

    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        System.out.println(list.get(0));
    }
}
