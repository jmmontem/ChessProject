public class Queen extends Piece
{
    public Queen(int color)
    {
        super(color, Board.QUEEN);
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