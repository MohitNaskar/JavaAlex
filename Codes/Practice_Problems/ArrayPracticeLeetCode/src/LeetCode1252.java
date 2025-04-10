public class LeetCode1252 {
    //https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
    public static void main(String[] args) {

    }
    public static int oddCells(int m, int n, int[][] indices) {
            int[][] ans = new int[m][n];

            for (int i = 0; i < indices.length; i++) {
                for (int j = 0; j < n; j++) { // Fix: Use 'n' here for column iteration
                    ans[indices[i][0]][j]++;
                }
                for (int j = 0; j < m; j++) { // This should iterate over 'm' for rows
                    ans[j][indices[i][1]]++;
                }
            }

            int res = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (ans[i][j] % 2 != 0) {
                        res++;
                    }
                }
            }
            return res;
    }
}
