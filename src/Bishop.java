public class Bishop extends Piece
{
    public Bishop(int color)
    {
        super(color, 4);
    }

    @Override
    public String toString()
    {
        if (this.getColor() == 1)
        {
            return "WB";
        }
        else
        {
            return "BB";
        }
    }
    
}