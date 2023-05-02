package game;

/**
 * Location of x/y grid to relate squares and pieces
 */
public class Location {
    private int x;
    private int y;


    //constructor for locations
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //getters of locations
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
