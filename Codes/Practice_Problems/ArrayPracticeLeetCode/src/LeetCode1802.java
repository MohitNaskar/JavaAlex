public class LeetCode1802 {
    //https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
    public static void main(String[] args) {
        maxValue(4,2,6);
    }
    public static int maxValue(int n, int index, int maxSum) {
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0;i < n ;i++){
            if(sum < maxSum){
                nums[i] = maxSum/2-i;
                sum += nums[i];
            }
        }
        return sum;
    }
}
