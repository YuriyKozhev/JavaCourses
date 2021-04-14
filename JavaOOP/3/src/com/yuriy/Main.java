package com.yuriy;

public class Main {

    public static void main(String[] args) {
        show(new UIControl(true));
        show(new TextBox());
    }

    public static void show(UIControl uiControl) {
        if (uiControl instanceof TextBox) {
            TextBox textBox = (TextBox) uiControl;
            textBox.setText("Hi");
        }
        System.out.println(uiControl);
    }
}
