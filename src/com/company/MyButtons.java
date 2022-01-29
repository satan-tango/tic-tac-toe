package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons implements ActionListener {
    CustomeButton button1 = new CustomeButton(1);
    CustomeButton button2 = new CustomeButton(2);
    CustomeButton button3 = new CustomeButton(3);
    CustomeButton button4 = new CustomeButton(4);
    CustomeButton button5 = new CustomeButton(5);
    CustomeButton button6 = new CustomeButton(6);
    CustomeButton button7 = new CustomeButton(7);
    CustomeButton button8 = new CustomeButton(8);
    CustomeButton button9 = new CustomeButton(9);
    ImageIcon iconCross = new ImageIcon("cross.png");
    ImageIcon iconZero = new ImageIcon("zero.png");
    LogicOfTheGame logic = new LogicOfTheGame();
    private int index;

    MyButtons() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        CustomeButton btn = (CustomeButton) e.getSource();
        if (logic.CheckWhoShouldWalk()) {
            logic.BringDataToField(btn.getIndex());
            btn.setIcon(iconCross);
            btn.setDisabledIcon(iconCross);
            btn.setEnabled(false);
            if (logic.isGameOver()) {
                JOptionPane.showMessageDialog(null, "Player #1 won, grats",
                        "Game over", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        } else {
            logic.BringDataToField(btn.getIndex());
            btn.setIcon(iconZero);
            btn.setDisabledIcon(iconZero);
            btn.setEnabled(false);
            if (logic.isGameOver()) {
                JOptionPane.showMessageDialog(null, "Player #2 won, grats",
                        "Game over", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        }

    }
}
