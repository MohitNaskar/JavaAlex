public class LeetCode540 {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/description/

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        else if (nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        else{
            for (int i = 1; i < nums.length-2; i++) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }
        return nums[0];

    }
}
