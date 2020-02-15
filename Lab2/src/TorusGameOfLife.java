public class TorusGameOfLife extends GameOfLife{
    /* Constructors*/
    public TorusGameOfLife() {
        super();
    }

    public TorusGameOfLife(int s){
        super(s);
    }

    public TorusGameOfLife(int[][] array){
        super(array);
    }

    @Override
    public int neighbors(int row, int col) {
        int count = 0;
        //checks top left
        if(row - 1 >= 0 && col - 1 >=0 && previous[row -1][col - 1] == 1){
            count++;
        }
        else if (row - 1 < 0){
            if(col - 1 < 0 && previous[previous.length - 1][previous.length - 1] == 1) {
                count++;
            }
            else if(col - 1 >= 0 && previous[previous.length - 1][col - 1] == 1){
                count++;
            }
        }
        else if (col - 1 < 0){
            if(row - 1 < 0 && previous[previous.length - 1][previous.length - 1] == 1) {
                count++;
            }
            else if(row - 1 >= 0 && previous[row - 1][previous.length - 1] == 1){
                count++;
            }
        }
        //checks top
        if(row - 1 >= 0 && previous[row -1][col] == 1){
            count++;
        }
        else if(row - 1 < 0 && previous[previous.length - 1][col] == 1){
            count++;
        }
        //checks top right
        if(row - 1 >= 0 && col + 1 < previous.length && previous[row - 1][col + 1] == 1){
            count++;
        }
        else if(row - 1 < 0){
            if(col + 1 == previous.length && previous[previous.length - 1][0] == 1) {
                count++;
            }
            else if(col + 1 < previous.length && previous[previous.length - 1][col + 1] == 1){
                count++;
            }
        }
        else if(col + 1 == previous.length){
            if(row - 1 < 0 && previous[previous.length - 1][0] == 1) {
                count++;
            }
            else if(row - 1 >= 0 && previous[row - 1][0] == 1){
                count++;
            }
        }
        //checks left
        if(col - 1 >= 0 && previous[row][col - 1] == 1){
            count++;
        }
        else if (col - 1 < 0 && previous[row][previous.length - 1] == 1) {
            count++;
        }
        //checks right
        if(col + 1 < previous.length && previous[row][col + 1] == 1){
            count++;
        }
        else if(col + 1 == previous.length && previous[row][0] == 1){
            count++;
        }
        //checks bottom left
        if (row + 1 < previous.length && col - 1 >= 0 && previous[row + 1][col - 1] == 1) {
            count++;
        }
        else if (row + 1 == previous.length){
            if(col - 1 < 0 && previous[0][previous.length - 1] == 1) {
                count++;
            }
            else if(col - 1 >= 0 && previous[0][col - 1] == 1){
                count++;
            }
        }
        else if (col - 1 < 0){
            if(row + 1 == previous.length && previous[0][previous.length - 1] == 1) {
                count++;
            }
            else if(row + 1 < previous.length && previous[row + 1][previous.length - 1] == 1){
                count++;
            }
        }
        //checks bottom
        if(row + 1 < previous.length && previous[row + 1][col] == 1){
            count++;
        }
        else if(row + 1 == previous.length && previous[0][col] == 1){
            count++;
        }
        //checks bottom right
        if(row + 1 < previous.length && col + 1 < previous.length && previous[row + 1][col + 1] == 1){
            count++;
        }
        else if(row + 1 == previous.length){
            if(col + 1 == previous.length && previous[0][0] == 1) {
                count++;
            }
            else if(col + 1 < previous.length && previous[0][col + 1] == 1){
                count++;
            }
        }
        else if(col + 1 == previous.length){
            if(row + 1 >= previous.length && previous[0][0] == 1) {
                count++;
            }
            else if(row + 1 < previous.length && previous[row + 1][0] == 1){
                count++;
            }
        }
        return count;
    }
}
