import java.util.Arrays;

public class LeetCode1 {
    //https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j && nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
        int i = 0;
        while (i < nums.length ) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
            i++;
        }
        return null;
    }
}
