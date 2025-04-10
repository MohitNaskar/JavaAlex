public class LeetCode53 {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] nums) {
        //using kanades algorithm
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length;i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
