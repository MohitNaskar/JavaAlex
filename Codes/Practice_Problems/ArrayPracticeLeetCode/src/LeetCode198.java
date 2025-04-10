public class LeetCode198 {
    //https://leetcode.com/problems/house-robber/
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
    }
    public static int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int n = nums.length-1;
        int case1 = rob1(nums,1,n);
        int case2 = rob1(nums,0,n-1);

        return Math.max(case1,case2);
    }
    public static int rob1(int[] nums,int start , int end) {
        int rob1 = 0;
        int rob2 = 0;
        for (int i = start;i <=end ;i++){
            int temp = Math.max( nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return Math.max(rob1, rob2);
    }
}
