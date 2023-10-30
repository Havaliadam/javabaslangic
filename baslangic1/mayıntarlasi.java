package baslangic1;
import java.util.Scanner;
import java.util.Random;

public class mayıntarlasi {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int boardSize = 5; // Oyun tahtasının boyutunu belirleyin
            int numberOfMines = 5; // Oyun tahtasına yerleştirilecek mayın sayısı

            char[][] gameBoard = new char[boardSize][boardSize];
            char[][] mineBoard = new char[boardSize][boardSize];

            initializeBoard(gameBoard);
            initializeBoard(mineBoard);

            placeMines(mineBoard, numberOfMines, random);

            boolean gameOver = false;

            while (!gameOver) {
                printBoard(gameBoard);

                System.out.print("Satır girin: ");
                int row = scanner.nextInt();
                System.out.print("Sütun girin: ");
                int col = scanner.nextInt();

                if (mineBoard[row][col] == 'X') {
                    System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                    gameOver = true;
                } else {
                    int adjacentMines = countAdjacentMines(mineBoard, row, col);
                    gameBoard[row][col] = (char) (adjacentMines + '0');

                    if (adjacentMines == 0) {
                        revealEmptyCells(gameBoard, mineBoard, row, col);
                    }

                    if (isGameWon(gameBoard, mineBoard)) {
                        System.out.println("Tebrikler! Oyunu kazandınız.");
                        gameOver = true;
                    }
                }
            }
        }

        private static void initializeBoard(char[][] board) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = '-';
                }
            }
        }

        private static void printBoard(char[][] board) {
            System.out.println("Oyun Tahtası:");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static void placeMines(char[][] board, int numberOfMines, Random random) {
            int count = 0;
            while (count < numberOfMines) {
                int row = random.nextInt(board.length);
                int col = random.nextInt(board[0].length);

                if (board[row][col] != 'X') {
                    board[row][col] = 'X';
                    count++;
                }
            }
        }

        private static int countAdjacentMines(char[][] mineBoard, int row, int col) {
            int count = 0;
            int[][] directions = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1} };

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 0 && newRow < mineBoard.length && newCol >= 0 && newCol < mineBoard[0].length) {
                    if (mineBoard[newRow][newCol] == 'X') {
                        count++;
                    }
                }
            }
            return count;
        }

        private static void revealEmptyCells(char[][] gameBoard, char[][] mineBoard, int row, int col) {
            if (row < 0 || row >= gameBoard.length || col < 0 || col >= gameBoard[0].length || gameBoard[row][col] != '-') {
                return;
            }

            int adjacentMines = countAdjacentMines(mineBoard, row, col);
            gameBoard[row][col] = (char) (adjacentMines + '0');

            if (adjacentMines == 0) {
                int[][] directions = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1} };
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    revealEmptyCells(gameBoard, mineBoard, newRow, newCol);
                }
            }
        }

        private static boolean isGameWon(char[][] gameBoard, char[][] mineBoard) {
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[i].length; j++) {
                    if (gameBoard[i][j] == '-' && mineBoard[i][j] != 'X') {
                        return false;
                    }
                }
            }
            return true;
        }
    }


