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
     * Test case 1
     * oneStep() → B
     */
    @Test
    public void testOneStep1(){
        int[][] A = {{0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 1, 1, 1, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.oneStep();
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * oneStep:
     * Test case 2
     * oneStep() → B
     */
    @Test
    public void testOneStep2(){
        int[][] A = {{0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 1, 0},
                    {0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0},
                    {0, 1, 0, 0, 1, 0},
                    {0, 1, 0, 0, 1, 0},
                    {0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.oneStep();
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * oneStep:
     * Test case 3
     * oneStep() → B
     */
    @Test
    public void testOneStep3(){
        int[][] A = {{0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0},
                    {0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.oneStep();
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * oneStep:
     * Test case 4
     * oneStep() → B
     */
    @Test
    public void testOneStep4(){
        int[][] A = {{1, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {1, 0, 0, 0, 0, 1}};

        int[][] B = {{1, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {1, 0, 0, 0, 0, 1}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.oneStep();
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * oneStep:
     * Test case 5
     * oneStep() → B
     */
    @Test
    public void testOneStep5(){
        int[][] A = {{0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.oneStep();
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
    Test cases for Neighbors ---------------------------------------------------------------------------------------------
     */

    /*
     * Neighbors:
     * Test case 1
     * neighbors(2, 1) → 1
     */
    @Test
    public void testNeighbors1(){
        int[][] A = {{0, 0, 0},
                {0, 0, 0},
                {0, 1, 1}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        assertEquals(1, GOL.neighbors( 2, 1));
    }

    /*
     * Neighbors:
     * Test case 2
     * neighbors(0, 0) → 5
     */
    @Test
    public void testNeighbors2(){
        int[][] A = {{1, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        assertEquals(5, GOL.neighbors( 0, 0));
    }

    /*
     * Neighbors:
     * Test case 3
     * neighbors(4, 1) → 3
     */
    @Test
    public void testNeighbors3(){
        int[][] A = {{1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 0, 0, 1}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        assertEquals(3, GOL.neighbors( 4, 1));
    }

    /*
     * Neighbors:
     * Test case 4
     * neighbors(4, 2) → 5
     */
    @Test
    public void testNeighbors4(){
        int[][] A = {{0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        assertEquals(5, GOL.neighbors( 4, 2));
    }

    /*
     * Neighbors:
     * Test case 5
     * neighbors(2, 2) → 8
     */
    @Test
    public void testNeighbors5(){
        int[][] A = {{1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        assertEquals(8, GOL.neighbors( 2, 2));
    }

     /*
    Test cases for Evolution ---------------------------------------------------------------------------------------------
     */

    /*
     * Evolution:
     * Test case 1
     * evolution(2) → B
     */
    @Test
    public void testEvolution1(){
        int[][] A = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};
        int[][] B = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.evolution(2);
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * Evolution:
     * Test case 2
     * evolution(3) → B
     */
    @Test
    public void testEvolution2(){
        int[][] A = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};
        int[][] B = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 0, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.evolution(3);
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * Evolution:
     * Test case 3
     * evolution(1) → B
     */
    @Test
    public void testEvolution3(){
        int[][] A = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0}};
        int[][] B = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 1},
                {0, 0, 1, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 1, 1, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.evolution(1);
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * Evolution:
     * Test case 4
     * evolution(5) → B
     */
    @Test
    public void testEvolution4(){
        int[][] A ={{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        int[][] B = {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.evolution(5);
        assertArrayEquals(B, GOL.getBoard());
    }

    /*
     * Evolution:
     * Test case 5
     * evolution(7) → B
     */
    @Test
    public void testEvolution5(){
        int[][] A ={{1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        int[][] B = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.evolution(7);
        assertArrayEquals(B, GOL.getBoard());
    }
}