public class Pawn extends Piece
{
    public Pawn(int color)
    {
        super(color, Board.PAWN);
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
}