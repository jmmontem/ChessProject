import java.util.ArrayList;

public class BoardPiece {
    
    private int pieceRow;
    private int pieceCol;
    private boolean isAlive;
    private final Enum.Color color;
    private final Enum.PieceID id;
    
    
    public BoardPiece(int row, int col) {
        this.pieceRow = row;
        this.pieceCol = col;
        this.color = Enum.Color.None;
        this.id = Enum.PieceID.None;
        this.isAlive = false;
    }

    public BoardPiece(int row, int col, Enum.Color color, Enum.PieceID id) {
        this.pieceRow = row;
        this.pieceCol = col;
        this.color = color;
        this.id = id;
        this.isAlive = true;
    }

    @Override
    public String toString() {
        return "00";
    }
    
    public int getRow() {
        return pieceRow;
    }
    
    public void setRow(int newRow) {
        this.pieceRow = newRow;
    }
    
    public int getCol() {
        return pieceCol;
    }
    
    public void setCol(int newCol) {
        this.pieceCol = newCol;
    }
    
    public boolean getIsAlive() {
        return isAlive;
    }
    
    public void setIsAlive(boolean bool) {
        this.isAlive = bool;
    }

    public Enum.Color getColor() {
        return color;
    }

    public Enum.PieceID getPieceID() {
        return id;
    }
    
    public boolean canCheck(int kingRow, int kingCol, BoardPiece[][] gameBoard) {
        return false;
    }
    
    
    // Need the opposite King Piece
    public boolean canMove(int newRow, int newCol, BoardPiece[][] gameBoard) {
        return false;
    }
    
    
    // Check row and col boundery
    public boolean checkRowCol(int row, int col) {
        return (row >= 0 && row <= 7) && (col >= 0 && col <= 7);
    }
    
}