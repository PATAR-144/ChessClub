package board;
import game.Location;
import game.LocationMatrix;
import pieces.Pawn;
import pieces.Piece;

import java.util.Arrays;


public class Board {
    private final Square[][] squareMatrix = new Square[8][8];
    private final LocationMatrix locationMatrix = new LocationMatrix();
    private Piece piece;

    public Board(){
        Color currentColor;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 % 2 != 0)){
                    currentColor = Color.BLACK;
                } else {
                    currentColor = Color.WHITE;
                }
                squareMatrix[i][j] = new Square(currentColor, locationMatrix.getLocationMatrix(i, j));
            }
        }

    }

    public Square getSquare(int i, int j){
        return squareMatrix[i][j];
    }

    public void printBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(squareMatrix[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Board{" +
                "squareMatrix=" + Arrays.toString(squareMatrix) +
                ", locationMatrix=" + locationMatrix +
                '}';
    }

}
