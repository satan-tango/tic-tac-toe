package com.company;

import javax.swing.*;

public class CustomeButton extends JButton {
    private int index;

    CustomeButton(int index) {
        this.index = index;
    }
    public int getIndex() {
        return this.index;
    }

}
