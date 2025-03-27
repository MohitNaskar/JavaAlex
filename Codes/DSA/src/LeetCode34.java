import java.util.ArrayList;

public class LeetCode34 {
    //Find first and last position of element in the sorted array
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        res[0] = start;// to traverse the left side of the array
        res[1] = end;// to traverse the right side of the array
        return res;
    }
    public static int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ans = mid;//first potential ans
                if(findStartIndex){ //to traverse the left side of the array
                    high = mid - 1;
                }
                else{
                    low = mid + 1; //to traverse the right side of the array
                }
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = searchRange(new int[]{1,3,3,5,6}, 3);
        LinearSearch.print(arr);
    }
}
