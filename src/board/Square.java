package board;

import game.Location;
import pieces.Piece;

/**
 * class for the board squares
 */
public class Square {
    private final Color COLOR;
    private final Location location;
    private boolean isOccupied;

    public Square(Color COLOR, Location location) {
        this.COLOR = COLOR;
        this.location = location;
        this.isOccupied = false;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public Location getLocation(){
        return location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "Square{" +
                "COLOR=" + COLOR +
                ", location=" + location +
                '}';
    }

}
