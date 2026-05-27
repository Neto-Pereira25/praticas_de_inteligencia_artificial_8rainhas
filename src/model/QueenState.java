package model;

import java.util.Arrays;

public class QueenState {

    private int[] queens;
    private int currentRow;

    public QueenState() {
        this.queens = new int[8];
        Arrays.fill(this.queens, -1);
        this.currentRow = 0;
    }

    public QueenState(int[] queens, int currentRow) {
        this.queens = queens;
        this.currentRow = currentRow;
    }

    public int[] getQueens() {
        return queens;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public boolean isGoal() {
        return currentRow == 8;
    }
}
