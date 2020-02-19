public class Board
{

    public static void main(String[] args)
    {
        Board x = new Board();

    }

    Spot[][] board;

    public Board()
    {
        board = new Spot[8][8];
        this.setBoard();
    }

    public boolean validSpot(int row, int col)
    {
        return ((row >=0 && col >= 0) && (row < 8 && col < 8));
    }

    public Spot checkSpot(int row, int col)
    {
        return this.board[row][col];
    }

    private void setBoard()
    {
        // Black
        this.setPieces(0, 1, Piece.PieceColor.BLACK);
        // White
        this.setPieces(7, 6, Piece.PieceColor.WHITE);
    }

    private void setPieces(int firstRow, int secondRow, Piece.PieceColor color)
    {
        this.board[firstRow][0] = new Spot(firstRow, 0, new Rook(color));
        this.board[firstRow][1] = new Spot(firstRow, 1, new Knight(color));
        this.board[firstRow][2] = new Spot(firstRow, 2, new Bishop(color));
        this.board[firstRow][3] = new Spot(firstRow, 3, new Queen(color));
        this.board[firstRow][4] = new Spot(firstRow, 4, new King(color));
        this.board[firstRow][5] = new Spot(firstRow, 5, new Bishop(color));
        this.board[firstRow][6] = new Spot(firstRow, 6, new Knight(color));
        this.board[firstRow][7] = new Spot(firstRow, 7, new Rook(color));
        this.board[secondRow][0] = new Spot(secondRow, 0, new Pawn(color));
        this.board[secondRow][1] = new Spot(secondRow, 1, new Pawn(color));
        this.board[secondRow][2] = new Spot(secondRow, 2, new Pawn(color));
        this.board[secondRow][3] = new Spot(secondRow, 3, new Pawn(color));
        this.board[secondRow][4] = new Spot(secondRow, 4, new Pawn(color));
        this.board[secondRow][5] = new Spot(secondRow, 5, new Pawn(color));
        this.board[secondRow][6] = new Spot(secondRow, 6, new Pawn(color));
        this.board[secondRow][7] = new Spot(secondRow, 7, new Pawn(color));

    }


}