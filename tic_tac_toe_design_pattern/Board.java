package tic_tac_toe_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;

    Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean placePiece(int row,int col ,PlayingPiece pieceType){
        if(row<0 || col<0 || row>=size || col>=size){
            throw new IllegalArgumentException("Invalid position");
        }
        if(board[row][col]!=null){
            return false;
        }
        board[row][col] = pieceType;
        return true;
    }
    public List<Pair> getFreeSpace(){
        List<Pair> freeSpaces = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    freeSpaces.add(new Pair(i,j));
                }
            }
        }

        return freeSpaces;
    }

    public void printMatrix(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

}
