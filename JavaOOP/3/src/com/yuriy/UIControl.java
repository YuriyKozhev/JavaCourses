package com.yuriy;

public class UIControl {
    public boolean isEnabled() {
        return isEnabled;
    }

    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

}
