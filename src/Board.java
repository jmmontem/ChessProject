public class Board
{

    public static void main(String[] args)
    {
        Board x = new Board();
        System.out.println(x.toString());
        Piece test = x.board[6][3].getPiece();
        test.canMove(x, x.board[1][3], 4, 3);

    }

    PieceSpot[][] board;

    public Board()
    {
        board = new PieceSpot[8][8];
        this.setBoard();
    }

    public boolean validSpot(int row, int col)
    {
        return ((row >=0 && col >= 0) && (row < 8 && col < 8));
    }

    public PieceSpot checkSpot(int row, int col)
    {
        return this.board[row][col];
    }

    @Override
    public String toString()
    {

        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        String strBoard = "";
        boolean space = true;
        for (int row = 0; row < board.length; row++)
        {

            strBoard += (board.length - row);

            for (int col = 0; col < board[row].length; col++)
            {
                if (board[row][col] == null)
                {
                    strBoard += " 00 ";
                }
                else
                {
                    strBoard += " " + board[row][col].getPiece().toString() + " ";
                }
            }

            strBoard += '\n';

            if (row == board.length - 1)
            {
                strBoard += "  ";
                for (int i = 0; i < letter.length; i++)
                {
                    strBoard += " "+ letter[i] + "  ";
                }
            }
        }

        return strBoard;
    }

    private void setBoard()
    {
        // Black             // Color Black = 2
        this.setPieces(0, 1, 2);
        // White             // Color White = 1
        this.setPieces(7, 6, 1);
    }

    private void setPieces(int firstRow, int secondRow, int color)
    {
        this.board[firstRow][0] = new PieceSpot(firstRow, 0, new Rook(color));
        this.board[firstRow][1] = new PieceSpot(firstRow, 1, new Knight(color));
        this.board[firstRow][2] = new PieceSpot(firstRow, 2, new Bishop(color));
        this.board[firstRow][3] = new PieceSpot(firstRow, 3, new Queen(color));
        this.board[firstRow][4] = new PieceSpot(firstRow, 4, new King(color));
        this.board[firstRow][5] = new PieceSpot(firstRow, 5, new Bishop(color));
        this.board[firstRow][6] = new PieceSpot(firstRow, 6, new Knight(color));
        this.board[firstRow][7] = new PieceSpot(firstRow, 7, new Rook(color));
        this.board[secondRow][0] = new PieceSpot(secondRow, 0, new Pawn(color));
        this.board[secondRow][1] = new PieceSpot(secondRow, 1, new Pawn(color));
        this.board[secondRow][2] = new PieceSpot(secondRow, 2, new Pawn(color));
        this.board[secondRow][3] = new PieceSpot(secondRow, 3, new Pawn(color));
        this.board[secondRow][4] = new PieceSpot(secondRow, 4, new Pawn(color));
        this.board[secondRow][5] = new PieceSpot(secondRow, 5, new Pawn(color));
        this.board[secondRow][6] = new PieceSpot(secondRow, 6, new Pawn(color));
        this.board[secondRow][7] = new PieceSpot(secondRow, 7, new Pawn(color));
    }


}