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
}