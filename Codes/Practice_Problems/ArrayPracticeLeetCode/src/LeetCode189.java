import java.util.Arrays;

public class LeetCode189 {
    //https://leetcode.com/problems/rotate-array/description/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
    }

    public static void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k , nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}