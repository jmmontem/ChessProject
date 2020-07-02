import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juanm
 */
public class GameBoardTest {
    
    private GameBoard gameBoard;
    
    public GameBoardTest() {
        gameBoard = new GameBoard();
    }

    
    /**
     * Test of toString method, of class GameBoard.
     */
    @Test
    public void testToString() {
        String toCompare = "\n1  00  00  00  00  00  00  00  00  \n" +
                           "2  BP  BP  BP  BP  BP  BP  BP  BP  \n" +
                           "3  00  00  00  00  00  00  00  00  \n" +
                           "4  00  00  00  00  00  00  00  00  \n" +
                           "5  00  00  00  00  00  00  00  00  \n" +
                           "6  00  00  00  00  00  00  00  00  \n" +
                           "7  WP  WP  WP  WP  WP  WP  WP  WP  \n" +
                           "8  00  00  00  00  00  00  00  00  \n" +
                           "   A   B   C   D   E   F   G   H\n";
        String result = gameBoard.toString();
        assertEquals(toCompare, result);
    }

    /**
     * Test of getTotalRow method, of class GameBoard.
     */
    @Test
    public void testGetTotalRow() {
        assertEquals(gameBoard.getTotalRow(), 8);
    }

    
    /**
     * Test of getTotalCol method, of class GameBoard.
     */
    @Test
    public void testGetTotalCol() {
        assertEquals(gameBoard.getTotalCol(), 8);
    }
    
}
