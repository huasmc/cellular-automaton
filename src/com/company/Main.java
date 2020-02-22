package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        int generation = 10;

        for(int gen=0; gen < generation; gen++) {
            int[][] newBoard = BoardGenerator.generateBoard(board.getBoard(), board.getBoard().length, board.getBoard()[0].length);
            board.setBoard(newBoard);
            System.out.println(Arrays.deepToString(board.getBoard())
                    .replace("0", " ")
                    .replace("1", "X")
                    .replace("], ", "]\n")
                    .replaceAll("[\\[\\] ,]", " "));
            generation++;
        }
    }
}
