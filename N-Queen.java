import java.util.Arrays;

class Main {

    static int SIZE = 4;

    // Function to print the chess board
    public static void printBoard(char[][] chessBoard) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(chessBoard[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to check if placing a queen is safe
    public static boolean isSafe(char[][] chessBoard, int R, int C) {
        // Check the column above the current position
        for (int i = 0; i < R; i++) {
            if (chessBoard[i][C] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = R, j = C; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = R, j = C; i >= 0 && j < SIZE; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Recursive function to solve the N-Queens problem
    public static void nQueenSolution(char[][] chessBoard, int R) {
        if (R == SIZE) {
            printBoard(chessBoard); // Print the board when a solution is found
            return;
        }

        for (int C = 0; C < SIZE; C++) {
            if (isSafe(chessBoard, R, C)) {
                chessBoard[R][C] = 'Q'; // Place the queen
                nQueenSolution(chessBoard, R + 1); // Solve for the next row
                chessBoard[R][C] = '-'; // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        char[][] chessBoard = new char[SIZE][SIZE];

        // Initialize the chess board
        for (int r = 0; r < chessBoard.length; r++) {
            Arrays.fill(chessBoard[r], '-');
        }

        System.out.println("Initial Board:");
        printBoard(chessBoard);

        System.out.println("Solutions:");
        nQueenSolution(chessBoard, 0);
    }
}
