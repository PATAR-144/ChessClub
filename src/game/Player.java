package game;

import pieces.Color;

public class Player {
    private final Color COLOR;

    public Player(Color COLOR){
        this.COLOR = COLOR;
    }

    public Color getCOLOR() {
        return COLOR;
    }

}
