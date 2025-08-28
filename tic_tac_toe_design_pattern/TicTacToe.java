package tic_tac_toe_design_pattern;

public class TicTacToe {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", new PlayingPiece(PieceType.X));
        Player player2 = new Player("Bob", new PlayingPiece(PieceType.O));

        Game game = new Game();
        game.initalize(player1, player2);
        System.out.println("Game Winner is  :"+game.startGame());
    }
}
