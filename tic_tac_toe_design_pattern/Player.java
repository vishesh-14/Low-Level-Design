package tic_tac_toe_design_pattern;

public class Player {
    String name;
    PlayingPiece playingPiece;
    Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
