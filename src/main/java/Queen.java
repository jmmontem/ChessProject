
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
        
        int queenRow = this.getRow();
        int queenCol = this.getCol();
        
        // Diagonal Right Down
        int col = queenCol + 1;
        for (int i = queenRow + 1; i <= 7; i++) {
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
            
            col++;
        }
        
        // Diaogonal Left Up
        col = queenCol - 1;
        for (int i = queenRow - 1; i >= 0; i--) {
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
          
            col--;
        }
        
        // Diagonal Right Up
        col = queenCol - 1;
        for (int i = queenRow + 1; i <= 7; i++) {
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
          
            col--;
        }
        
        
        // Diagonal Right Up
        col = queenCol + 1;
        for (int i = queenRow - 1; i >= 0; i--) {
            
            if (gameBoard[i][col].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && col == kingCol;
            }
            else if (gameBoard[i][col].getPieceID() != Enum.PieceID.King && gameBoard[i][col].getPieceID() != Enum.PieceID.None) {
                break;
            }
          
            col++;
        }
        
       
        // Check for left
        for (int i = queenRow - 1; i >= 0; i--) {
            if (gameBoard[i][queenCol].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && queenCol == kingCol;
            }
            else if (gameBoard[i][queenCol].getPieceID() != Enum.PieceID.King && gameBoard[i][queenCol].getPieceID() != Enum.PieceID.None) {
                break;
            }
        }
        
        // Check for Right
        for (int i = queenRow + 1; i <= 7; i++) {
            if (gameBoard[i][queenCol].getPieceID() == Enum.PieceID.King) {
                return i == kingRow && queenCol == kingCol;
            }
            else if (gameBoard[i][queenCol].getPieceID() != Enum.PieceID.King && gameBoard[i][queenCol].getPieceID() != Enum.PieceID.None) {
                break;
            }
        }
        
        // Check for Down
        for (int i = queenCol + 1; i <= 7; i++) {
            if (gameBoard[queenRow][i].getPieceID() == Enum.PieceID.King) {
                return queenRow == kingRow && i == kingCol;
            }
            else if (gameBoard[queenRow][i].getPieceID() != Enum.PieceID.King && gameBoard[queenRow][i].getPieceID() != Enum.PieceID.None) {
                break;
            }  
        }
        
        // Check for Up
        for (int i = queenCol - 1; i >= 0; i--) {
            if (gameBoard[queenRow][i].getPieceID() == Enum.PieceID.King) {
                return queenRow == kingRow && i == kingCol;
            }
            else if (gameBoard[queenRow][i].getPieceID() != Enum.PieceID.King && gameBoard[queenRow][i].getPieceID() != Enum.PieceID.None) {
                break;
            }  
        }
        
        return false;
    }
    
}
