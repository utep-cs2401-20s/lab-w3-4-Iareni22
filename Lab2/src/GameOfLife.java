public class GameOfLife {

    int size;
    boolean[][] board;
    boolean[][] previous;

    /* Constructors*/
    public GameOfLife() {}

    public GameOfLife(int s){
        size = s;
        board = new boolean[size][size];
        previous = new boolean[size][size];
    }

    public GameOfLife(boolean[][] board){
        size = board.length;
        previous = new boolean[size][size];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; i < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }

    /* Getters */
    public boolean[][] getBoard() {
        return board;
    }

    public void oneStep(){
        int numNeigh;
        for(int i = 0; i < size; i++) {
            for (int j = 0; i < size; j++) {
                numNeigh = neighbors(i, j);
                if(previous[i][j] = true){
                    if (numNeigh == 2 || numNeigh == 3)
                        board[i][j] = true;
                    else
                        board[i][j] = false;
                }
                else{
                    if(numNeigh == 3)
                        board[i][j] = true;
                    else
                        board[i][j] = false;
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; i < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }

    }

    public int neighbors(int row, int col){ // count live neighbors
        int count = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == board[row - 1][col - 1]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row - 1][col]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row - 1][col + 1]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row - 1][col]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row][col-1]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row - 1][col + 1]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row + 1][col - 1]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row + 1][col]){
                    if(isAlive(i,j));
                    count++;
                }
                else if(board[i][j] == board[row + 1][col + 1]){
                    if(isAlive(i,j));
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        return count;
    }

    public void evolution(int n){ //call one step n times
        for(int i = 0; i < n; i++){
            oneStep();
        }
    }

    public void printBoard(){

    }

    public boolean isAlive(int row, int col){
        if(board[row][col])
            return true;
        else
            return false;
    }

}// end of class
