/**
 * Created by Tal on 7/11/2018.
 */
public class MatrixPaths {
    public static void main(String[] args){
        System.out.println(calcMatrixPaths(3,3));
    }

    private static int calcMatrixPaths(int rows, int cols) {
        int count = 0;
        if(rows == 0 || cols == 0)
            return 0;
        if(rows == 1 || cols == 1)
            return 1;

        count += calcMatrixPaths(rows - 1, cols);
        count += calcMatrixPaths(rows, cols - 1);

        return count;
    }
}
