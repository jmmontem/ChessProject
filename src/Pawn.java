public class Pawn extends Piece
{
    boolean canMoveThree;
    public Pawn(int color)
    {
        super(color, 1);
        this.canMoveThree = true;
    }

    @Override
    public String toString()
    {
        if (this.getColor() == 1)
        {
            return "WP";
        }
        else
        {
            return "BP";
        }
    }

    public boolean getCanMoveThree()
    {
        return this.canMoveThree;
    }

    @Override
    public boolean canMove(Board board, PieceSpot myPiece, int rowMove, int colMove)
    {
        if (canMoveThree == true && board.board[rowMove][colMove] == null)
        {
            int rowDiff = Math.abs(myPiece.getRowPos() - rowMove);
            int colDiff = Math.abs(myPiece.getColPos() - colMove);
            System.out.println("Row Diff: " + rowDiff + " Col Diff: " + colDiff);
            return true;
        }

        return false;
    }

}