package board;

import game.Location;

/**
 * class for the board squares
 */
public class Square {
    private Color COLOR;

    public Square(Color COLOR) {
        this.COLOR = COLOR;
    }

    public Color getCOLOR() {
        return COLOR;
    }


}
