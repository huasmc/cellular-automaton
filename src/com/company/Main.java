package com.company;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();

        while(true) {
            int[][] newBoard = BoardGenerator.generateBoard(board.getBoard(), board.getBoard().length, board.getBoard()[0].length);
            board.setBoard(newBoard);
            BoardDisplay.display(board);
//            System.out.println(Arrays.deepToString(board.getBoard())
//                    .replace("0", " ")
//                    .replace("1", "X")
//                    .replace("], ", "]\n")
//                    .replaceAll("[\\[\\] ,]", " "));
        }
    }
}
