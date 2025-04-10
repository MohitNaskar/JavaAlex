import java.util.Arrays;

public class LeetCode1365 {
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static void main(String[] args) {
        int[] arr ={8,1,2,2,3};
        int[]  res = new int[arr.length];
        res = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(res));

    }
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] res = new int[nums.length];
//        for (int i = 0; i< nums.length;i++){
//            res[i] = findSmaller(nums,i);
//        }
//        return res;
//    }
//    static int findSmaller(int[] nums,int index){
//        int count = 0;
//        for(int i = 0;i< nums.length; i++){
//            if(index == i){
//                continue;
//            }
//            else{
//                if(nums[index] > nums[i])
//                    count++;
//            }
//        }
//        return count;
//    }
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] res = new int[nums.length];
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int index = 0; index < nums.length; index++) {
//                if (index == i) {
//                    continue;
//                } else {
//                    if (nums[index] < nums[i])
//                        count++;
//                }
//            }
//            res[i] = count;
//            count = 0;
//        }
//        return res;
//    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        int i = 0;
        while(i < nums.length) {
            for (int index = 0; index < nums.length; index++) {
                if (index == i) {
                    continue;
                } else {
                    if (nums[index] < nums[i])
                        count++;
                }
            }
            res[i] = count;
            count = 0;
            i++;
        }
        return res;
    }
}
