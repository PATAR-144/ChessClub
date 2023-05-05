package game;

import board.Square;
import pieces.Piece;

public class Move {
    private Square initialSquare;
    private Square finalSquare;
    private Piece piece;

    public Move(Square initialSquare, Square finalSquare, Piece piece){
        this.initialSquare = initialSquare;
        this.finalSquare = finalSquare;
        this.piece = piece;


        initialSquare.setPiece(null);
        initialSquare.setOccupied(false);
        this.piece.setLocation(finalSquare.getLocation());
        finalSquare.setOccupied(true);
        finalSquare.setPiece(piece);
    }
}
