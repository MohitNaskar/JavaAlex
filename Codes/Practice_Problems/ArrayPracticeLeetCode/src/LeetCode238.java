import java.util.Arrays;

public class LeetCode238 {
    //https://leetcode.com/problems/product-of-array-except-self/description/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        Arrays.fill(suffix, 1);
        Arrays.fill(prefix, 1);
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }
}
