package com.yuriy;

public class TextBox extends UIControl {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void clear() {
        this.setText("");
    }

}
