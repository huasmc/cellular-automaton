package com.company;

public class BoardDisplay {

    private BoardDisplay() {
        throw new IllegalStateException("Utility class");
    }

    public static void display(Board board) {
        int[][] grid = board.getBoard();
        System.out.println("\033[H\033[2J");
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] == 1 ? "#" : ".");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
