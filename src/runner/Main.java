package runner;

import game.Game;
import pieces.Color;
import pieces.Pawn;
import pieces.Piece;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getBoard().getSquare(0, 0).isOccupied());
        game.getBoard().getSquare(0, 0).setOccupied(true);
        System.out.println(game.getBoard().getSquare(0, 0).isOccupied());
        System.out.println(game.getBoard().getSquare(0, 0).getPiece());
        Pawn pawn = new Pawn(Color.WHITE, game.getBoard().getSquare(0, 0).getLocation());
        game.getBoard().getSquare(0, 0).setPiece(pawn);

        System.out.println(game.getBoard().getSquare(0, 0).getPiece());
        System.out.println(pawn.getLocation());

    }
}
