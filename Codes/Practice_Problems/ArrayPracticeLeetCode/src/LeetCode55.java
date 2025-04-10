public class LeetCode55 {
    //https://leetcode.com/problems/jump-game/
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
    public static boolean canJump(int[] nums) {
        int maxJump = 0; // first max is initialized to 0
        for (int i = 0; i < nums.length; i++) {
            if (i > maxJump) { // if with any iteration i is greater than maxJump jump cannot be made to next location
                return false;
            }
            maxJump = Math.max(maxJump, i + nums[i]);
        }
        return true;
    }
}
