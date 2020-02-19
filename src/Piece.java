public abstract class Piece
{
    public static enum PieceColor
    {
        WHITE, BLACK
    }

    private boolean isAlive;
    PieceColor color;

    public Piece(PieceColor color)
    {
        this.isAlive = true;
        this.color = color;
        
    }
    
    public boolean checkIsAlive()
    {
        return isAlive;
    }

    public void setIsAlive(boolean state)
    {
        this.isAlive = state;
    }

    public PieceColor getColor()
    {
        return this.color;
    }

    public void setPieceColor(PieceColor color)
    {
        this.color = color;
    }

}
