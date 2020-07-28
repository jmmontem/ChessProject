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
        int oKingRow = this.getRow();
        int oKingCol = this.getCol();
        
        int up = this.getCol() - 1;
        int down = this.getCol() + 1;
        int left = this.getRow() - 1;
        int right = this.getRow() + 1;
        
        boolean upCheck = oKingRow == kingRow && up == kingCol;
        boolean downCheck = oKingRow == kingRow && down == kingCol;
        boolean leftCheck = left == kingRow && oKingCol == kingCol;
        boolean rightCheck = right == kingRow && oKingCol == kingCol;
        boolean upLeftCheck = left == kingRow && up == kingCol;
        boolean upRightCheck = right == kingRow && up == kingCol;
        boolean downLeftCheck = left == kingRow && down == kingCol;
        boolean downRightCheck = right == kingRow && down == kingCol;
        
        return upCheck || downCheck || leftCheck || rightCheck || upLeftCheck || upRightCheck || downLeftCheck || downRightCheck;
    }
    
    
    @Override
    public boolean canMove(int newRow, int newCol, BoardPiece[][] gameBoard) {
        
        if (this.checkRowCol(newRow, newCol)) {
            
            int oKingRow = this.getRow();
            int oKingCol = this.getCol();

            int up = this.getCol() - 1;
            int down = this.getCol() + 1;
            int left = this.getRow() - 1;
            int right = this.getRow() + 1;

            boolean upCheck = oKingRow == newRow && up == newCol;
            boolean downCheck = oKingRow == newRow && down == newCol;
            boolean leftCheck = left == newRow && oKingCol == newCol;
            boolean rightCheck = right == newRow && oKingCol == newCol;
            boolean upLeftCheck = left == newRow && up == newCol;
            boolean upRightCheck = right == newRow && up == newCol;
            boolean downLeftCheck = left == newRow && down == newCol;
            boolean downRightCheck = right == newRow && down == newCol;
            
            // this doesn't include castling
            return upCheck || downCheck || leftCheck || rightCheck || upLeftCheck || upRightCheck || downLeftCheck || downRightCheck;
            
        }
        
        return false;
    }
    
    
    public ArrayList<BoardPiece> checkExist(BoardPiece[][] gameBoard) {
        ArrayList<BoardPiece> allChecks = new ArrayList<>();
        for (BoardPiece piece: checkPieces) {
            if (piece.canCheck(this.getRow(), this.getCol(), gameBoard)) {
                allChecks.add(piece);
            }
        }
        
        return allChecks;
    }
}
