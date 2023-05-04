package game;

import board.Board;
import pieces.Color;

public class Game {
    private final Player whitePlayer;
    private final Player blackPlayer;
    private final Board board;

    public Game(){
        this.whitePlayer = new Player(Color.WHITE);
        this.blackPlayer = new Player(Color.BLACK);
        this.board = new Board();
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public Board getBoard() {
        return board;
    }

}
