package pieces;

import game.Location;

/**
 * Abstract class for pieces
 */

public abstract class Piece {
    private Type TYPE;
    private Color COLOR;
    private Location location;


    //constructor for pieces
    public Piece(Type TYPE, Color COLOR, Location location){
        this.COLOR = COLOR;
        this.TYPE = TYPE;
        this.location = location;
    }



    //getters, setters, and toString for pieces
    public Type getTYPE() {
        return TYPE;
    }

    public void setTYPE(Type TYPE) {
        this.TYPE = TYPE;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(Color COLOR) {
        this.COLOR = COLOR;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "TYPE=" + TYPE +
                ", COLOR=" + COLOR +
                ", location=" + location +
                '}';
    }

}
