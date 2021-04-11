package com.yuriy;

import java.awt.*;
import java.util.Date;
//import org.apache.commons.lang.SerializationUtils;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point();
        point1.x = 2;
        String name = point2.toString();
        String modified = name.replace("]", ")");
        int cond = modified.indexOf("]");
        System.out.println("Hello World " + modified + cond);
    }
}
