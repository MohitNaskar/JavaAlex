import java.util.Arrays;

public class LeetCode441 {
    //https://leetcode.com/problems/arranging-coins/
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        int[] dp = new int[n + 1];
        int i = 0;
        for (i = 1; i <=n; i++) {
            n -= i;
            dp[i-1] = n;
        }

        return i-1;
    }

}
