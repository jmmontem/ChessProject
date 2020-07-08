
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
public class Bishop extends BoardPiece {
    
    public Bishop(int row, int col, Enum.Color color) {
        super(row, col, color, Enum.PieceID.Bishop);
    }

    @Override
    public String toString() {
        if (this.getColor() == Enum.Color.White) {
            return "WB";
        }
        else {
            return "BB";
        }
    }
    
    @Override
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        return false;
    }
}


