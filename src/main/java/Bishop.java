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
    // Diagonal canCheck
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {

        int bishopRow = this.getRow();
        int bishopCol = this.getCol();
        
        // Diagonal Right Down
        int col = bishopCol + 1;
        for (int i = bishopRow + 1; i <= 7; i++) {
            if (col > 7) {
                break;
            }
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
            
            col++;
        }
        
        // Diaogonal Left Up
        col = bishopCol - 1;
        for (int i = bishopRow - 1; i >= 0; i--) {
            if (col < 0) {
                break;
            }
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
          
            col--;
        }
        
        // Diagonal Right Up
        col = bishopCol - 1;
        for (int i = bishopRow + 1; i <= 7; i++) {
            if (col < 0) {
                break;
            }
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
          
            col--;
        }
        
        
        // Diagonal Right Up
        col = bishopCol + 1;
        for (int i = bishopRow - 1; i >= 0; i--) {
            if (col > 7) {
                break;
            }
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
          
            col++;
        }

        return false;
    }
}


