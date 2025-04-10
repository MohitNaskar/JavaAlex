import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode54 {
    //https://leetcode.com/problems/spiral-matrix/description/
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new List[]{spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})}));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            int startRow = 0;
            int startColumn = 0;
            int endRow = matrix.length - 1;
            int endColumn = matrix[0].length - 1;
            while (startRow <= endRow && startColumn <= endColumn) {
                for (int i = startColumn; i <= endColumn; i++) {
                    result.add(matrix[startRow][i]);
                }
                for (int i = startRow + 1; i <= endRow; i++) {
                    result.add(matrix[i][endColumn]);
                }
                if (startRow < endRow) {
                    for (int i = endColumn - 1; i >= startColumn; i--) {
                        result.add(matrix[endRow][i]);
                    }
                }
                if (startColumn < endColumn) {
                    for (int i = endRow - 1; i > startRow; i--) {
                        result.add(matrix[i][startColumn]);
                    }
                }
                startRow++;
                startColumn++;
                endRow--;
                endColumn--;
            }
            return result;
    }
}
