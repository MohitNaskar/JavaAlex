import java.util.Arrays;

public class LeetCode1470 {
    //https://leetcode.com/problems/shuffle-the-array/description/
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(arr, n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res1 = new int[n];
        int[] res2 = new int[n];
        int[] res = new int[2*n];
//
//        for (int i = 0; i < n; i++) {
//            res1[i] = nums[i];
//            res2[i] = nums[i+n];
//        }
////        for (int i = n; i < 2*n; i++) {
////            res2[i-n] = nums[i];
////        }
//        int j = 0;
//        for (int i = 0; i < 2*n; i+=2) {
//
//            res[i] = res1[j];
//            res[i + 1] = res2[j];
//            j++;
//        }
//        return res;
        int j = 0;
        for (int i = 0; i < 2 * n; i+=2) {
            res[i] = nums[j];
            res[i+1] = nums[j+n];
            j++;
        }
        return res;
    }
}
