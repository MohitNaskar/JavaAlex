public class LeetCode33 {

    public static int search(int[] nums, int target) {
        //we can apply binary search here by dividing the array into two parts then applying binary
        //search in those two parts to find the target value
        int high = findPivot(nums);
        int res = binarySearch(nums,target,0,high);
        if(res == -1){
            return binarySearch(nums,target,high+1,nums.length -1);
        }
        return res;
    }
    public static int binarySearch(int[] nums,int target,int low,int high){
        int mid = 0;
        boolean isAscending = true;
        while(low <= high){
            if(nums[low] > nums[high]){
                isAscending = false;
            }
            mid = low +(high-low)/2;
            if (target == nums[mid]){
                return mid;
            }
            if(isAscending){
                if(nums[mid] > target){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(nums[mid]>target){
                    low = mid +1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static int findPivot(int[] nums){
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low < high){
            mid = low +(high-low)/2;
            if(nums[mid] > nums[mid + 1]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5,1,3}, 3));
    }
}
