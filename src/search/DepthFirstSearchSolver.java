package search;

import model.QueenState;

public class DepthFirstSearchSolver {

    private int nodesCreated = 0;

    public QueenState solve(QueenState initialState) {
        return dfs(initialState);
    }

    private QueenState dfs(QueenState state) {

        nodesCreated++;

        if (state.isGoal()) {
            return state;
        }

        int row = state.getCurrentRow();

        for (int col = 0; col < 8; col++) {

            if (isSafe(state.getQueens(), row, col)) {

                int[] newQueens = state.getQueens().clone();
                newQueens[row] = col;

                QueenState child = new QueenState(newQueens, row + 1);

                QueenState result = dfs(child);

                if (result != null) {
                    return result;
                }
            }
        }

        return null;
    }

    private boolean isSafe(int[] queens, int row, int col) {

        for (int i = 0; i < row; i++) {

            int placedCol = queens[i];

            // mesma coluna
            if (placedCol == col) {
                return false;
            }

            // diagonal principal/secundária
            if (Math.abs(i - row) == Math.abs(placedCol - col)) {
                return false;
            }
        }

        return true;
    }

    public int getNodesCreated() {
        return nodesCreated;
    }
}
