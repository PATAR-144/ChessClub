package board;

import game.Location;
import pieces.Piece;

/**
 * class for the board squares
 */
public class Square {
    private Color COLOR;
    private Location location;
    private Piece piece;

    public Square(Color COLOR, Location location) {
        this.COLOR = COLOR;
        this.location = location;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public Location getLocation(){
        return location;
    }

    @Override
    public String toString() {
        return "Square{" +
                "COLOR=" + COLOR +
                ", location=" + location +
                '}';
    }

}
