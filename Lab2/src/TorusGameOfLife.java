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
        if(row == 0 && col == 0){

        }
        if(row - 1 >= 0 && col - 1 >=0 && board[row -1][col - 1] == 1){
            count++;
        }
        if(row - 1 >= 0 && previous[row -1][col] == 1){
            count++;
        }
        if(row - 1 >= 0 && col + 1 < board.length && board[row - 1][col + 1] == 1){
            count++;
        }
        if(col - 1 >= 0 && board[row][col - 1] == 1){
            count++;
        }
        if(col + 1 < board.length && board[row][col + 1] == 1){
            count++;
        }
        if (row + 1 < board.length && col - 1 >= 0 && board[row + 1][col - 1] == 1) {
            count++;
        }
        if(row + 1 >= 0 && board[row + 1][col] == 1){
            count++;
        }
        if(row + 1 < board.length && col + 1 < board.length && previous[row + 1][col + 1] == 1){
            count++;
        }
        return count;
    }
}
