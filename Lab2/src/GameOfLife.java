public class GameOfLife {

    int size;
    int[][] board;
    int[][] previous;

    /* Constructors*/
    public GameOfLife() {}

    public GameOfLife(int s){
        this.size = s;
        this.board = new int[size][size];
        this.previous = new int[size][size];
    }

    public GameOfLife(int[][] array){
        this.size = array.length;
        this.previous = new int[size][size];
        this.board = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < array[0].length; j++){
                this.previous[i][j] = array[i][j];
                this.board[i][j] = array[i][j];
            }
        }
    }

    /* Getters */
    public int[][] getBoard() {
        return board;
    }

    public void oneStep(){
        int numNeigh;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numNeigh = neighbors(i, j);
                if(previous[i][j] == 1){
                    if (numNeigh == 2 || numNeigh == 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                }
                else{
                    if(numNeigh == 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }

    }

    public int neighbors(int row, int col){ // count live neighbors
        int count = 0;
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

    public void evolution(int n){ //call one step n times
        for(int i = 0; i < n; i++){
            oneStep();
        }
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int isAlive(int row, int col){
        if(previous[row][col] == 1)
            return 1;
        else
            return 0;
    }

}// end of class
