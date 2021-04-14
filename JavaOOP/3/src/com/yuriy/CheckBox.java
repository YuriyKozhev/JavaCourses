package com.yuriy;

public class CheckBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }

    public CheckBox() {
        super(true);
    }
}
