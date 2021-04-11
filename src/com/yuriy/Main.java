package com.yuriy;

//import org.apache.commons.lang.SerializationUtils;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Main {

    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(.891);
        System.out.println(result);
    }
}
