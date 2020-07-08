

public class Pawn extends BoardPiece {

    private boolean canMoveTwo = true;

    public Pawn(int row, int col, Enum.Color color) {
        super(row, col, color, Enum.PieceID.Pawn);
    }

    @Override
    public String toString() {
        if (this.getColor() == Enum.Color.White) {
            return "WP";
        }
        else {
            return "BP";
        }
    }
    
    @Override
    // Checks if the pawn position is a threath to the opposite king. For pawn there is no need for gameBoard
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        int pawnRow = this.getRow();
        int pawnCol = this.getCol();
        
        int checkLeftRow = pawnRow - 1;
        int checkRightRow = pawnRow + 1;
        
        int checkUpCol = pawnCol - 1;
        int checkDownCol = pawnCol + 1;
        
        return (checkLeftRow == kingRow || checkRightRow == kingRow) && (checkUpCol == kingCol || checkDownCol == kingCol);
    }
}