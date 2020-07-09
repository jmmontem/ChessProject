import java.util.ArrayList;

public class GameBoard  {

        private final int TotalRow;
        private final int TotalCol;
        
        private BoardPiece[][] gameBoard;
        
        // New Plan save the pieces of black and white into the opposite side
        // Create a function called isCheck for each one that checks if they are currently checking the opposite king...
        private ArrayList<BoardPiece> blackPieces;
        private ArrayList<BoardPiece> whitePieces;
        
       
        // Constructor
        public GameBoard() {
            this.TotalRow = 8;
            this.TotalCol = 8;
            // Create the gameBoard 
            this.gameBoard = new BoardPiece[this.TotalRow][this.TotalCol];
            this.blackPieces = new ArrayList<BoardPiece>();
            this.whitePieces = new ArrayList<BoardPiece>();
            // Set the starting pieces...
            this.initGameBoard();
            
        }
        
        // Inititalize GameBoard
        private void initGameBoard() {
            // Construct Both Kings
            gameBoard[4][0] = new King(4, 0, Enum.Color.Black, whitePieces);
            blackPieces.add(gameBoard[4][0]);
            
            gameBoard[4][7] = new King(4, 7, Enum.Color.White, blackPieces);
            whitePieces.add(gameBoard[4][7]);
           
            // Setting up Black Pawns
            for (int row = 0; row < TotalRow; row++) {
                gameBoard[row][1] = new Pawn(row, 1, Enum.Color.Black);
                blackPieces.add(gameBoard[row][1]);
            }
            
            gameBoard[0][0] = new Rook(0, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[0][0]);
            gameBoard[1][0] = new Knight(1, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[1][0]);
            gameBoard[2][0] = new Bishop(2, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[2][0]);
            gameBoard[3][0] = new Queen(3, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[3][0]);
            gameBoard[5][0] = new Bishop(5, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[5][0]);
            gameBoard[6][0] = new Knight(6, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[6][0]);
            gameBoard[7][0] = new Rook(7, 0, Enum.Color.Black);
            blackPieces.add(gameBoard[7][0]);
           
            // Setting up Empty Field
            for (int row = 0; row < TotalRow; row++) {
                for (int col = 2; col < 6; col++) {
                    gameBoard[row][col] = new BoardPiece(row, col);
                }
            }      
            
            // Setting up White Pawns
            for (int row = 0; row < TotalRow; row++) {
                gameBoard[row][6] = new Pawn(row, 6, Enum.Color.White);
                whitePieces.add(gameBoard[row][6]);
            }
            
            gameBoard[0][7] = new Rook(0, 0, Enum.Color.White);
            whitePieces.add(gameBoard[0][7]);
            gameBoard[1][7] = new Knight(1, 7, Enum.Color.White);
            whitePieces.add(gameBoard[1][7]);
            gameBoard[2][7] = new Bishop(2, 7, Enum.Color.White);
            whitePieces.add(gameBoard[2][7]);
            gameBoard[3][7] = new Queen(3, 7, Enum.Color.White);
            whitePieces.add(gameBoard[3][7]);
            gameBoard[5][7] = new Bishop(5, 7, Enum.Color.White);
            whitePieces.add(gameBoard[5][7]);
            gameBoard[6][7] = new Knight(6, 7, Enum.Color.White);
            whitePieces.add(gameBoard[6][7]);
            gameBoard[7][7] = new Rook(7, 7, Enum.Color.White);
            whitePieces.add(gameBoard[7][7]);
            
            
            King blackKing = (King) gameBoard[4][0];
            System.out.println(blackKing.checkExist(gameBoard));
            King whiteKing = (King) gameBoard[4][7];
            System.out.println(whiteKing.checkExist(gameBoard));
        }
        

 
        // To String
        @Override
        public String toString() {
            String gameStr = "\n";
            for (int col = 0; col < TotalCol; col++) {
                gameStr += (col + 1) + "  ";
                for (int row = 0; row < TotalRow; row++) {
                    gameStr += gameBoard[row][col].toString() + "  ";
                }
                gameStr += "\n";
            }
            
            gameStr += "   A   B   C   D   E   F   G   H\n";
            
            return gameStr;
        }

        // Get Total Row
        public int getTotalRow() {
            return TotalRow;
        }

        // Get Total Col
        public int getTotalCol() {
            return TotalCol;
        }
}