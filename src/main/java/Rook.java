

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
public class Rook extends BoardPiece{
    
    public Rook(int row, int col, Enum.Color color) {
        super(row, col, color, Enum.PieceID.Rook);
    }

    @Override
    public String toString() {
        if (this.getColor() == Enum.Color.White) {
            return "WR";
        }
        else {
            return "BR";
        }
    }
    
    @Override
    // canCheck by checking if its the right kingrow and ringCol from left, right, up, and down...
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        // Move Left and Right or Up and Down
        
        int rookRow = this.getRow();
        int rookCol = this.getCol();
        
        // Check for left
        for (int i = rookRow - 1; i >= 0; i--) {
            if (gameBoard[i][rookCol].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && rookCol == kingCol;
            }
            else if (gameBoard[i][rookCol].getPieceID() != Enum.PieceID.King && gameBoard[i][rookCol].getPieceID() != Enum.PieceID.None) {
                break;
            }
        }
        
        // Check for Right
        for (int i = rookRow + 1; i <= 7; i++) {
            if (gameBoard[i][rookCol].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && rookCol == kingCol;
            }
            else if (gameBoard[i][rookCol].getPieceID() != Enum.PieceID.King && gameBoard[i][rookCol].getPieceID() != Enum.PieceID.None) {
                break;
            }
        }
        
        // Check for Down
        for (int i = rookCol + 1; i <= 7; i++) {
            if (gameBoard[rookRow][i].getPieceID() == Enum.PieceID.King) {
                return rookRow == kingRow && i == kingCol;
            }
            else if (gameBoard[rookRow][i].getPieceID() != Enum.PieceID.King && gameBoard[rookRow][i].getPieceID() != Enum.PieceID.None) {
                break;
            }  
        }
        
        // Check for Up
        for (int i = rookCol - 1; i >= 0; i--) {
            if (gameBoard[rookRow][i].getPieceID() == Enum.PieceID.King) {
                return rookRow == kingRow && i == kingCol;
            }
            else if (gameBoard[rookRow][i].getPieceID() != Enum.PieceID.King && gameBoard[rookRow][i].getPieceID() != Enum.PieceID.None) {
                break;
            }  
        }
        
        return false;
    }
    
}
