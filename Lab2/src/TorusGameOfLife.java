public class TorusGameOfLife extends GameOfLife{
    /*constructors - can use super();
    inherit: neighbors, onestep, evolution
     */

    @Override
    public int neighbors(int row, int col) { //use modulus (%)
        return super.neighbors(row, col);
    }
}
