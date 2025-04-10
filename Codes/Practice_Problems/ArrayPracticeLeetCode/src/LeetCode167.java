import java.util.Arrays;

public class LeetCode167 {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;//left pointer
        int right = numbers.length-1; //right pointer
        for (int k = left; k <= right; k++){
            for (int j = k+1; j <= right; j++) {
                if (numbers[k] + numbers[j] == target) {
                    return new int[]{k + 1, j + 1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
