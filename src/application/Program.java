package application;

import model.QueenState;
import search.DepthFirstSearchSolver;
import util.BoardPrinter;

public class Program {

    public static void main(String[] args) throws Exception {
        System.out.println("==============================");
        System.out.println("TABULEIRO VAZIO");
        System.out.println("==============================");

        executeTest(createEmptyBoard(), 0);

        System.out.println("\n==============================");
        System.out.println("TABULEIRO COM 1 RAINHA");
        System.out.println("==============================");

        int[] board1 = createEmptyBoard();
        board1[0] = 0;

        executeTest(board1, 1);

        System.out.println("\n==============================");
        System.out.println("TABULEIRO COM 2 RAINHAS");
        System.out.println("==============================");

        int[] board2 = createEmptyBoard();
        board2[0] = 0;
        board2[1] = 4;

        executeTest(board2, 2);

        System.out.println("\n==============================");
        System.out.println("TABULEIRO COM 3 RAINHAS");
        System.out.println("==============================");

        int[] board3 = createEmptyBoard();
        board3[0] = 0;
        board3[1] = 4;
        board3[2] = 7;

        executeTest(board3, 3);
    }

    private static void executeTest(int[] board, int currentRow) {

        QueenState initialState = new QueenState(board, currentRow);

        DepthFirstSearchSolver solver = new DepthFirstSearchSolver();

        QueenState solution = solver.solve(initialState);

        if (solution != null) {

            System.out.println("Solução encontrada!\n");

            BoardPrinter.printBoard(solution.getQueens());

            System.out.println("\nNós criados: " + solver.getNodesCreated());

        } else {
            System.out.println("Nenhuma solução encontrada.");
        }
    }

    private static int[] createEmptyBoard() {

        int[] board = new int[8];

        for (int i = 0; i < 8; i++) {
            board[i] = -1;
        }

        return board;
    }
}
