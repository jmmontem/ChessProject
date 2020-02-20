// Creates a space for each board row and col of the board
public class PieceSpot
{
    private Piece piece;
    private int rowPos;
    private int colPos;

    public PieceSpot(int row, int col, Piece piece)
    {
        this.piece = piece;
        this.rowPos = row;
        this.colPos = col;
    }

    public Piece getPiece()
    {
        return this.piece;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    public int getRowPos()
    {
        return this.rowPos;
    }

    public void setRowPos(int row)
    {
        this.rowPos = row;
    }

    public int getColPos()
    {
        return this.colPos;
    }

    public void setColPos(int col)
    {
        this.colPos = col;
    }
}