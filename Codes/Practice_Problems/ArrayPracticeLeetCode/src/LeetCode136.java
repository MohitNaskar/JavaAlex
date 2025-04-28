public class LeetCode136 {
    //https://leetcode.com/problems/single-number/?envType=problem-list-v2&envId=array
    public static void main (String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
    public static int singleNumber(int[] nums) {
//        if(nums.length == 1)    return nums[0];
//        int count = 0;
//        int start = 0;
//        while(start < nums.length){
//            for (int i = 0;i<nums.length;i++){
//                if (nums[start] == nums[i]){
//                    count++;
//                }
//            }
//            if (count == 1) return nums[start];
//            start++;
//            count = 0;
//        }
//        return -1;
        if(nums.length == 1)    return nums[0];
        int count = 0;
        for (int i = 0;i< nums.length;i++){
            for (int j = 0; j<nums.length;j++){
                if(nums[i] == nums[j])    count++;
            }
            if (count == 1) return nums[i];
            count = 0;
        }
        return -1;
    }
}
