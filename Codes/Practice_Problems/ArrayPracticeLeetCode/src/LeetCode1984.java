import java.util.Arrays;

public class LeetCode1984 {
    //https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=problem-list-v2&envId=sorting
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        System.out.println(minimumDifference(nums,2));
    }
    public static int minimumDifference(int[] nums, int k) {
        nums = mergeSort(nums);
        int min = Integer.MAX_VALUE;
        if (nums.length == 1)   return 0;
        for (int i = 0; i<=nums.length-k ;i++){
            int res = nums[k+i-1] - nums[i];
            if (res < min)
                min = res;
        }
        return min;
    }
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2; //dividing the element in two equal parts
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // to copy and store the left elements
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // to copy and store the right element
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0 ,k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            }
            else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            merged[k] = left[i];
            i++;k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            j++;k++;
        }
        return merged;
    }
}
