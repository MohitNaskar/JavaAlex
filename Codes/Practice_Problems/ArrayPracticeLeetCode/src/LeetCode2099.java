import java.util.Arrays;

public class LeetCode2099 {
    //https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/?envType=problem-list-v2&envId=sorting

    public static void main(String[] args) {
        int[] arr = {2,1,3,3};
        System.out.println(Arrays.toString(maxSubsequence(arr,2)));
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        nums = insertionSort(nums);
        int[] res = new int[k];
        int j = k-1;
        int temp = 0;
        int resSum = Integer.MIN_VALUE;
        //System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++){
            temp += nums[i];
            if (temp > resSum){
                if (j >= 0){
                    res[j] = nums[i];
                    j--;
                }
                else{
                    break;
                }
            }
        }
        return res;
    }
    public static int[] insertionSort(int[] arr)
    {
        for(int i = 0;i< arr.length -1;i++){
            for(int j = i+1; j>0;j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
