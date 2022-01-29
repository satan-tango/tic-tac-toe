package com.company;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        MyFrame frame = new MyFrame();
        DataOfTheGame data = new DataOfTheGame();
        while (flag) {
            if (data.getIsGameOver()) {
                frame.frameDispose();
                flag = false;
            }
        }
    }
}
