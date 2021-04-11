package com.yuriy;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
//import org.apache.commons.lang.SerializationUtils;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = new int[5][2];
        numbers[4][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        int[][] figures = {{ 3, 1, 2 }, { 1, 2}};
//        Arrays.sort(figures);
        System.out.println(Arrays.deepToString(figures));
    }
}
