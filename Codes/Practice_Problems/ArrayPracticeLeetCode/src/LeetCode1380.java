import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

public class LeetCode1380 {
    //https://leetcode.com/problems/lucky-numbers-in-a-matrix/
    public static void main(String[] args) {
        int[][] print = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(print));
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        //idea is to find the maximum element in the matrix first
        //then find the minimum element in the row of the maximum element
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int row = 0; //lowest row
            int colMax = matrix[i][0];
            // to check if its minimum in the row
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    row = j;
                }
            }
            // to check if its maximum in its column
            boolean isMax = true;
            for (int k = 0; k < matrix[i].length; k++) {
                if (min < matrix[k][row]) {
                    isMax = false;
                }
            }
            if (isMax){
                res.add(min);
            }

        }
        return res;
    }
}
