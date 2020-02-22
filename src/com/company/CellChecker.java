package com.company;

class CellChecker {

    static int generateCellState(int aliveCells, int cell) {
        if (cell == 1 && (aliveCells == 2 || aliveCells == 3)) {
            return 1;
        } else if (cell == 0 && aliveCells == 3) {
            return 1;
        }
        return 0;
    }

    static int getNeighbourCellsCount(int[][] grid, int row, int column) {

        int neighbourCellsCount = 0;

        // NW
        if (row - 1 >= 0 && column - 1 >= 0 && grid[row - 1][column - 1] == 1) {
            neighbourCellsCount++;
        }

        // N
        if (row - 1 >= 0 && grid[row - 1][column] == 1) {
            neighbourCellsCount++;
        }

        // NE
        if (row - 1 >= 0 && column + 1 < 8 && grid[row - 1][column + 1] == 1) {
            neighbourCellsCount++;
        }

        // L
        if (column - 1 >= 0 && grid[row][column - 1] == 1) {
            neighbourCellsCount++;
        }

        // R
        if (column + 1 < 8 && grid[row][column + 1] == 1) {
            neighbourCellsCount++;
        }

        // SW
        if (row + 1 < 8 && column - 1 < 8 & grid[row + 1][column - 1] == 1) {
            neighbourCellsCount++;
        }

        // S
        if (row + 1 < 8 && grid[row + 1][column] == 1) {
            neighbourCellsCount++;
        }

        // SE
        if (row + 1 < 8 && column + 1 < 8 && grid[row + 1][column + 1] == 1) {
            neighbourCellsCount++;
        }

        return neighbourCellsCount;
    }
}
