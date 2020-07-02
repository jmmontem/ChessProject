public class GameBoard  {

        private final int TotalRow;
        private final int TotalCol;
        private BoardPiece[][] gameBoard;
        
        // Constructor
        public GameBoard() {
            this.TotalRow = 8;
            this.TotalCol = 8;
            // Create the gameBoard 
            this.gameBoard = new BoardPiece[this.TotalRow][this.TotalCol];
            // Set the starting pieces...
            this.initGameBoard();
            
        }
        
        // Inititalize GameBoard
        private void initGameBoard() {
            // Setting up Black Pawns
            for (int row = 0; row < TotalRow; row++) {
                gameBoard[row][0] = new BoardPiece(row, 0);
                gameBoard[row][1] = new Pawn(row, 1, Enum.Color.Black);
            }
            // Setting up Empty Field
            for (int row = 0; row < TotalRow; row++) {
                for (int col = 2; col < 6; col++) {
                    gameBoard[row][col] = new BoardPiece(row, col);
                }
            }
            // Setting up White Pawns
            for (int row = 0; row < TotalRow; row++) {
                gameBoard[row][6] = new Pawn(row, 6, Enum.Color.White);
                gameBoard[row][7] = new BoardPiece(row, 7);
            }
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