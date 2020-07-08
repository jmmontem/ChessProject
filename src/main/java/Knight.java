

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
public class Knight extends BoardPiece{
    
    public Knight(int row, int col, Enum.Color color) {
        super(row, col, color, Enum.PieceID.Knight);
    }

    @Override
    public String toString() {
        if (this.getColor() == Enum.Color.White) {
            return "Wk";
        }
        else {
            return "Bk";
        }
    }
    
    
    @Override 
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        //Knights Movement... Col +- 3  && +- 1       Row +- 1 && +- 3
        int knightRow = this.getRow();
        int knightCol = this.getCol();
        
        int checkLeftRow = knightRow - 1;
        int checkRightRow = knightRow + 1;
        
        int checkLeftRow2 = knightRow - 2;
        int checkRightRow2 = knightRow + 2;
        
        int checkDownCol2 = knightCol + 2;
        int checkUpCol2 = knightCol - 2;
        
        int checkDownCol = knightCol + 1;
        int checkUpCol = knightCol -1;
        
        return ((checkLeftRow == kingRow || checkRightRow == kingRow) && (checkUpCol2 == kingCol || checkDownCol2 == kingCol)) || ((checkLeftRow2 == kingRow || checkRightRow2 == kingRow) && (checkUpCol == kingCol || checkDownCol == kingCol));
    }
    
}
