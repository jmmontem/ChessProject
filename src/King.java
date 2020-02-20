public class King extends Piece
{

    public King(int color)
    {
        super(color, Board.KING);
    }
    
    @Override
    public String toString()
    {
        if (this.getColor() == 1)
        {
            return "WK";
        }
        else
        {
            return "BK";
        }
    }
    
}