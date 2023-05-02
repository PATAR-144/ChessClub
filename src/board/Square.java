package board;

import game.Location;

/**
 * class for the board squares
 */
public class Square {
    private Color COLOR;
    private Location location;

    public Square(Color COLOR, Location location) {
        this.COLOR = COLOR;
        this.location = location;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public Location getLocation() {
        return location;
    }

}
