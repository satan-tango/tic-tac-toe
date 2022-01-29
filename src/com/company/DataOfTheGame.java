package com.company;

public class DataOfTheGame {
    private boolean firstPlayerWalk = true;
    private int gameFiled[][]= new int [3][3];
    private boolean gameOver = false;

    public void setIsGameOver(boolean flag) {
        this.gameOver = flag;
    }

    public boolean getIsGameOver() {
        return this.gameOver;
    }

    public boolean getTurn() {
        return this.firstPlayerWalk;
    }

    public void setTurn(boolean turn) {
        this.firstPlayerWalk = turn;
    }

    public void setGameField(int i, int j, int value) {
        this.gameFiled[i][j] = value;
    }

    public int[][] getGameField() {
        return this.gameFiled;
    }
}
