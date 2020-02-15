import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GOLTester {
    /*
    Example test displayed in piazza
     */
    @Test
    public void evolution() {
        // Declare and initialize board
        int[][] A = {{0, 0, 0},
                    {0, 1, 0},
                    {0, 0, 0}};
        /* Declare and initialize expected state of board AFTER n evolutions. 
        In this case, we will run one evolution, so B is the board that we should have after 1 evolution
         */
        int[][] B = {{0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}};
        // Declare and initialize instance of GOL (Remember that you guys will only test TORUS GOL, not the regular one)
        TorusGameOfLife x = new TorusGameOfLife(A); // Use the constructor that takes in an array
        // Call evolution method for the instance to compute n evolutions. In this test, we only compute 1.
        x.evolution(1);
        // assert that your expected (array B) is equal to the actual (board of instance)

        assertArrayEquals(B, x.getBoard());

    }
    // Torus test cases
    /*
    Test cases for OneStep ---------------------------------------------------------------------------------------------
     */

    /*
     * oneStep:
     * Test case 2:
     * oneStep() → exp
     */
    @Test
    public void oneStep(){

    }
}