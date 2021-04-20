package com.yuriy;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1, 2));

        IntBinaryOperator add2 = Integer::sum;
        System.out.println(add2.applyAsInt(1, 2));

        Function<Integer, Integer> square = a -> a * a;
        System.out.println(square.apply(add2.applyAsInt(1, 2)));
    }
}
