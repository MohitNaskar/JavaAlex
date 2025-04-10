public class LeetCode1499 {
    //https://leetcode.com/problems/max-value-of-equation/
    public static void main(String[] args) {
        System.out.println(MaxValue(new int[][]{{1,3},{2,0},{5,10}},1));
    }
    public static int MaxValue(int[][] arr, int k) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i+=2) {
            int check = arr[i][0] - arr[i+1][0];
            if ( check <= k) {
                current = arr[i][1] + arr[i+1][1] + Math.abs(check);
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
