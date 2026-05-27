package util;

public class BoardPrinter {

    public static void printBoard(int[] queens) {

        for (int row = 0; row < 8; row++) {

            for (int col = 0; col < 8; col++) {

                if (queens[row] == col) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }

            System.out.println();
        }
    }
}
