public class Queen extends Piece
{
    public Queen(int color)
    {
        super(color, 5);
    }
    
    @Override
    public String toString()
    {
        if (this.getColor() == 1)
        {
            return "WQ";
        }
        else
        {
            return "BQ";
        }
    }

}