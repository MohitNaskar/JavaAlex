public class LeetCode1351 {
    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;//counts the number of negative numbers
        int n = grid[0].length;
        for (int i = 0; i < grid.length; i++) {//to traverse through the array
            int low = 0;
            int high = grid[0].length - 1;
            int mid = 0;
            while (low <= high) {
                mid = low + (high-low) / 2;
                if (grid[i][mid] < 0) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            //low will be having the first index of the negative numbers
            count += n - low;
        }
        return count;
    }
}
