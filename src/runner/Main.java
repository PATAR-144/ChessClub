package runner;

import board.Board;
import game.Game;
import game.Location;
import game.LocationMatrix;
import game.Player;
import pieces.Bishop;
import pieces.Color;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getWhitePlayer().getCOLOR());
        System.out.println(game.getBlackPlayer().getCOLOR());
        game.getBoard().printBoard();




    }
}
