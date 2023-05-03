package board;
import game.Location;
import game.LocationMatrix;


public class Board {
    private Square[][] squareMatrix = new Square[8][8];
    private LocationMatrix locationMatrix = new LocationMatrix();

    public Board(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                //Color currentColor =
                squareMatrix[i][j] = new Square(currentColor, locationMatrix.getLocationMatrix(i, j));
            }
        }
    }

}
