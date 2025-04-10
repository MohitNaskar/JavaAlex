import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode73 {
    //https://leetcode.com/problems/set-matrix-zeroes/description/
    public static void main(String[] args) {
        setZeroes(new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> zeroes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroes.add(i);
                    zeroes.add(j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < zeroes.size(); i+=2) {
            //removes columns
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[zeroes.get(count)][k] = 0;
            }
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][zeroes.get(count + 1)] = 0;
            }
            count += 2;
        }
        System.out.println(zeroes);
        System.out.println(Arrays.deepToString(matrix));
    }
}
