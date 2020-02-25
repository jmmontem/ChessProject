public class King extends Piece
{

    public King(int color)
    {
        super(color, 6);
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