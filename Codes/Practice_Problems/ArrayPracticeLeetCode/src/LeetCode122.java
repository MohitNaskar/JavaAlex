public class LeetCode122 {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
    public static void main (String[] args) {
        int x = maxProfit(new int[]{1,2,3,4,5});
        System.out.println(x);
    }
    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }
}
