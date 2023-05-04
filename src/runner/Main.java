package runner;

import game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getBoard().getSquare(0, 0).isOccupied());
        game.getBoard().getSquare(0, 0).setOccupied(true);
        System.out.println(game.getBoard().getSquare(0, 0).isOccupied());

    }
}
