import java.util.Arrays;

public class LeetCode59 {
    //https://leetcode.com/problems/spiral-matrix-ii/
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    public static int[][] generateMatrix(int n) {
        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
        int[][] matrix = new int[n][n];
        int count = 0;
        while(startRow<= endRow && startCol<= endCol) {
            //for top row
            for(int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = ++count;
            }

            //for right column
            for (int i = startRow +1; i <= endRow; i++) {
                matrix[i][endCol] = ++count;
            }

            //for buttom row
            for (int i = endCol - 1; i >= startCol; i--) {
                matrix[endRow][i] = ++count;
            }
//            //for left col
            for (int i = endRow -1 ; i > startRow; i--) {
                matrix[i][startCol] = ++count;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}
