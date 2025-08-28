package tic_tac_toe_design_pattern;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> playersQueue;
    Board gameBoard;

    public void initalize(Player player1, Player player2){
        playersQueue = new LinkedList<>();
        playersQueue.add(player1);
        playersQueue.add(player2);
        gameBoard = new Board(3);
    }
    public String startGame(){
         boolean noWinner = true;
         while(noWinner){
            Player currentPlayer = playersQueue.pollFirst();
            List<Pair> freeSpaces = gameBoard.getFreeSpace();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                System.out.println("Match is tie");
                continue;
            }
             System.out.print("Player:" + currentPlayer.name + " Enter row,column: ");
             Scanner inputScanner = new Scanner(System.in);
             String s = inputScanner.nextLine();
             String[] values = s.split(",");
             int inputRow = Integer.valueOf(values[0]);
             int inputColumn = Integer.valueOf(values[1]);

             boolean isPlaced = gameBoard.placePiece(inputRow, inputColumn, currentPlayer.playingPiece);
             if(isPlaced == false){
                System.out.println("Invalid move, try again");
                playersQueue.addFirst(currentPlayer);
                continue;
             }
             gameBoard.printMatrix();
             playersQueue.addLast(currentPlayer);
             //check for winner

             boolean winner = isThereWinner(inputRow, inputColumn, currentPlayer.playingPiece.pieceType);
             if(winner) {
                 return currentPlayer.name;
             }
         }
         return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i< gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
