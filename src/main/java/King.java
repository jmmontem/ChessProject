public class King extends BoardPiece {
    
    private boolean kingIsCheck = false;
    private boolean canCastle = true;
    
    public King(int row, int col, Enum.Color color) {
        super(row, col, color, Enum.PieceID.King);
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
}
