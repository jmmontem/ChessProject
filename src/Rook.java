public class Rook extends Piece
{

    public Rook(int color)
    {
        super(color, 2);
    }
    
    @Override
    public String toString()
    {
        if (this.getColor() == 1)
        {
            return "WR";
        }
        else
        {
            return "BR";
        }
    }
}