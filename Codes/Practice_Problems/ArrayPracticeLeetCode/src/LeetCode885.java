import java.util.Arrays;

public class LeetCode885 {
    //https://leetcode.com/problems/spiral-matrix-iii/description/
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralMatrixIII(3,4,1,1)));
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int rowEnd = rows -1 ;
        int colEnd = cols -1 ;
        int rowStart = 0;
        int colStart = 0;
        int[][] matrix = new int[rows][cols];
        int[][] index = new int[rows * cols][2];
        int count = 0;
        int x = 0; //this is to handle the index values
        //to print the starting middle elements
        for (int i = cStart; i <= colEnd ;i++){
            matrix[rStart][i] = ++count;
            index[x][0] = rStart;
            index[x][1] = i;
            x++;
        }

        //to print the below row
        for (int i= colEnd; i >= 0 ;i--){
            matrix[rStart+1][i] = ++count;
            index[x][0] = rStart+1;
            index[x][1] = i;
            x++;
        }

        //to print the left col
        for (int i = rStart; i>= 0;i--){
            matrix[i][0] = ++count;
            index[x][0] = i;
            index[x][1] = colStart;
            x++;
        }

        //to print the top row
        for (int i = 1; i< colEnd; i++){
            matrix[0][i] = ++count;
            index[x][0] = rowStart;
            index[x][1] = i;
            x++;
        }



        System.out.println(Arrays.deepToString(index));
        return matrix;
    }
}
