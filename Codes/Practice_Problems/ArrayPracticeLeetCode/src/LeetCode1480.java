import java.util.Arrays;

public class LeetCode1480 {
    //https://leetcode.com/problems/running-sum-of-1d-array/description/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] res = runningSum(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            if (i >= 1){
                runningSum[i] += nums[i] + runningSum[i-1];
            }
            else{
                runningSum[i] += nums[i];
            }
        }
        return runningSum;
    }
}
