
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
public class Queen extends BoardPiece {
    
    
    public Queen(int row, int col, Enum.Color color) {
        super(row, col, color, Enum.PieceID.Queen);
    }

    @Override
    public String toString() {
        if (this.getColor() == Enum.Color.White) {
            return "WQ";
        }
        else {
            return "BQ";
        }
    }
    
    
    @Override
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        return false;
    }
    
}
