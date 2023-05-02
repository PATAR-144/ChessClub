package game;

import java.util.Arrays;

public class LocationMatrix {
    private final Location[][] locationMatrix = new Location[8][8];

    public LocationMatrix(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                locationMatrix[i][j] = new Location(i, j);
            }
        }
    }

    public Location getLocationMatrix(int x, int y) {
        return locationMatrix[x][y];
    }

    @Override
    public String toString() {
        return "LocationMatrix{" +
                "locationMatrix=" + Arrays.toString(locationMatrix) +
                '}';
    }

}
