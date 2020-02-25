public class Knight extends Piece
{
    public Knight(int color)
    {
        super(color, 3);
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