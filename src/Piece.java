public abstract class Piece
{
    private boolean isAlive;



    // 1 - White
    // 2 - Black
    int color;

    // 0 - NONE
    // 1 - Pawn
    // 2 - Rook
    // 3 - Knight
    // 4 - Bishop
    // 5 - Queen
    // 6 - King
    int pieceID;

    public Piece(int color, int id)
    {
        this.isAlive = true;
        this.color = color;
        this.pieceID = id;
        
    }
    
    public boolean checkIsAlive()
    {
        return isAlive;
    }

    public void setIsAlive(boolean state)
    {
        this.isAlive = state;
    }

    public int getColor()
    {
        return this.color;
    }

    public void setPieceColor(int color)
    {
        this.color = color;
    }

    public int getPieceID()
    {
        return pieceID;
    }

    public void setPieceID(int idNum)
    {
        this.pieceID = idNum;
    }

}
