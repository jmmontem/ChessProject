import java.util.ArrayList;

public class King extends BoardPiece {
    
    private boolean kingIsCheck = false;
    private boolean canCastle = true;
    private ArrayList<BoardPiece> checkPieces;
    
    public King(int row, int col, Enum.Color color, ArrayList<BoardPiece> checks) {
        super(row, col, color, Enum.PieceID.King);
        this.checkPieces = checks;
    }
    
    
    @Override
    public String toString() {
        if (this.getColor() == Enum.Color.White) {
            return "WK";
        }
        else {
            return "BK";
        }
    }
    
    @Override
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        return false;
    }
}
