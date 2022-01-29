package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    MyButtons buttons = new MyButtons();
    MyFrame() {
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(Color.black);
        panel.setLayout(new GridLayout(3,3,5,5));
        panel.add(buttons.button1);
        panel.add(buttons.button2);
        panel.add(buttons.button3);
        panel.add(buttons.button4);
        panel.add(buttons.button5);
        panel.add(buttons.button6);
        panel.add(buttons.button7);
        panel.add(buttons.button8);
        panel.add(buttons.button9);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void frameDispose() {
        frame.dispose();
    }
}
