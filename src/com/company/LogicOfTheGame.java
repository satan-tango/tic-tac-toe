package com.company;


public class LogicOfTheGame {
    DataOfTheGame data = new DataOfTheGame();

    public boolean CheckWhoShouldWalk() {
        if (data.getTurn()) {
            return true;
        } else {
            return false;
        }

    }

    public void BringDataToField(int index) {
        int value;
        if (data.getTurn()) {
            value = 1;
            data.setTurn(false);
        } else {
            value = 2;
            data.setTurn(true);
        }
        if (index <= 3) {
            data.setGameField(0, index - 1, value);
        } else if (index <= 6) {
            data.setGameField(1, index - 1 - 3, value);
        } else {
            data.setGameField(2, index - 1 - 6, value);
        }
    }

    public boolean isGameOver() {
        for (int i = 0; i < 3; i++) {
            if (data.getGameField()[i][0] == data.getGameField()[i][1]
                    && data.getGameField()[i][0] == data.getGameField()[i][2] &&
                    data.getGameField()[i][0] !=0) {
                data.setIsGameOver(true);
                return true;
            }
            if (data.getGameField()[0][i] == data.getGameField()[1][i]
                    && data.getGameField()[0][i] == data.getGameField()[2][i] &&
                    data.getGameField()[0][i] !=0) {
                data.setIsGameOver(true);
                return true;
            }
        }
        if (data.getGameField()[0][0] == data.getGameField()[1][1] &&
                data.getGameField()[0][0] == data.getGameField()[2][2] && data.getGameField()[0][0] !=0 ||
                data.getGameField()[2][0] == data.getGameField()[1][1] &&
                        data.getGameField()[2][0] == data.getGameField()[0][2] && data.getGameField()[2][0] !=0 ) {
            data.setIsGameOver(true);
            return true;
        }
        return false;
    }
}
