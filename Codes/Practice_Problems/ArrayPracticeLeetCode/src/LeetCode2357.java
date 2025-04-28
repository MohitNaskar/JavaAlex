import java.util.Arrays;

public class LeetCode2357 {
    //https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/?envType=problem-list-v2&envId=sorting
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
    }
    public static int minimumOperations(int[] nums) {
        nums = bubbleSort(nums);
        int count = 0;
        System.out.println(Arrays.toString(nums));
        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 0){
                for(int j = 0; j < nums.length; j++) {
                    nums[j] -= nums[i];
                }
                count++;
            }
        }
        return count;

    }
    public static boolean isZeroArray(int[] arr) {
        for (int num : arr) {
            if (num != 0) {
                return false; // found non-zero → not a zero array
            }
        }
        return true; // all elements were zero
    }

    public static int[] bubbleSort(int[] amount){
        boolean swaped = false;
        for(int i = 0;i <amount.length;i++){
            for(int j = 1; j < amount.length-i;j++){
                if (amount[j] > amount[j-1]){
                    swap(amount,j,j-1);
                    swaped = true;
                }
            }
            if(!swaped) break;
        }
        return amount;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
