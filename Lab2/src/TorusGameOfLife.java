public class TorusGameOfLife extends GameOfLife{
    /*constructors - can use super();
    inherit: neighbors, onestep, evolution
     */
    /* Constructors*/
    public TorusGameOfLife() {
        super();
    }

    public TorusGameOfLife(int s){
        super(s);
    }

    public TorusGameOfLife(int[][] board){
        super(board);
    }

    @Override
    public int neighbors(int row, int col) { //use modulus (%)
        int count = 0;
        if (row == 0 && col == 0) {
            if (previous[previous.length - 1][0] == 1) {
                count++;
            }
            if (previous[previous.length - 1][1] == 1) {
                count++;
            }
            if (previous[0][previous.length - 1] == 1) {
                count++;
            }
            if (previous[1][previous.length - 1] == 1) {
                count++;
            }
            if (previous[previous.length - 1][previous.length - 1] == 1) {
                count++;
            }
        }
        if (row == previous.length - 1 && col == 0) {
            if (previous[0][0] == 1) {
                count++;
            }
            if (previous[0][1] == 1) {
                count++;
            }
            if (previous[0][previous.length - 1] == 1) {
                count++;
            }
            if (previous[previous.length - 2][previous.length - 1] == 1) {
                count++;
            }
            if (previous[previous.length - 1][previous.length - 1] == 1) {
                count++;
            }
        }
        if (row == 0 && col == previous.length - 1) {
            if (previous[0][0] == 1) {
                count++;
            }
            if (previous[1][0] == 1) {
                count++;
            }
            if (previous[previous.length - 1][0] == 1) {
                count++;
            }
            if (previous[previous.length - 1][previous.length - 2] == 1) {
                count++;
            }
            if (previous[previous.length - 1][previous.length - 1] == 1) {
                count++;
            }

        }
        if (row == previous.length - 1 && col == previous.length - 1) {
            if (previous[0][0] == 1) {
                count++;
            }
            if (previous[0][previous.length - 2] == 1) {
                count++;
            }
            if (previous[0][previous.length - 1] == 1) {
                count++;
            }
            if (previous[previous.length - 2][0] == 1) {
                count++;
            }
            if (previous[previous.length - 1][0] == 1) {
                count++;
            }
        }
        if (row == 0 && (col > 0 || col < previous.length - 1)) {
            if (previous[row - 1][previous.length - 1] == 1) {
                count++;
            }
            if (previous[row][previous.length - 1] == 1) {
                count++;
            }
            if (previous[row + 1][previous.length - 1] == 1) {
                count++;
            }
        }
        if (row == previous.length && (col > 0 || col < previous.length - 1)){
            if (previous[row - 1][0] == 1) {
                count++;
            }
            if (previous[row][0] == 1) {
                count++;
            }
            if (previous[row + 1][0] == 1) {
                count++;
            }
        }
        if (col == 0 && (row > 0 || row < previous.length - 1)){
            if (previous[previous.length - 1][col - 1] == 1) {
                count++;
            }
            if (previous[previous.length - 1][col] == 1) {
                count++;
            }
            if (previous[previous.length][col + 1] == 1) {
                count++;
            }
        }
        if (col == previous.length && (row > 0 || row < previous.length - 1)){
            if (previous[0][col - 1] == 1) {
                count++;
            }
            if (previous[0][col] == 1) {
                count++;
            }
            if (previous[0][col] == 1) {
                count++;
            }
        }

        if(row - 1 >= 0 && col - 1 >=0 && previous[row -1][col - 1] == 1){
            count++;
        }
        if(row - 1 >= 0 && previous[row -1][col] == 1){
            count++;
        }
        if(row - 1 >= 0 && col + 1 < previous.length && previous[row - 1][col + 1] == 1){
            count++;
        }
        if(col - 1 >= 0 && previous[row][col - 1] == 1){
            count++;
        }
        if(col + 1 < previous.length && previous[row][col + 1] == 1){
            count++;
        }
        if (row + 1 < previous.length && col - 1 >= 0 && previous[row + 1][col - 1] == 1) {
            count++;
        }
        if(row + 1 >= 0 && previous[row + 1][col] == 1){
            count++;
        }
        if(row + 1 < previous.length && col + 1 < previous.length && previous[row + 1][col + 1] == 1){
            count++;
        }
        return count;
    }
}
