public class LeetCode1929 {
    //https://leetcode.com/problems/concatenation-of-array/description/
    public static void main(String[] args) {

    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        for (int i = 0;i < nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;

    }
}
