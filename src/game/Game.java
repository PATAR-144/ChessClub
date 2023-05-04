package game;

import board.Board;
import pieces.Color;

public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private Board board;

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
