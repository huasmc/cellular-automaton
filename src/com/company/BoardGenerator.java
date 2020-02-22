package com.company;

class BoardGenerator {

    static int[][] generateBoard(int[][] oldBoard, int numRows, int numColumns) {
        int[][] board = new int[numRows][numColumns];
        for(int row=1; row < oldBoard.length; row++) {
            for(int column=1; column < oldBoard[0].length; column++) {
                int neighbourCellsCount = CellChecker.getNeighbourCellsCount(oldBoard, row, column);
                board[row][column] = CellChecker.generateCellState(neighbourCellsCount, oldBoard[row][column]);
            }
        }
        return board;
    }
}
