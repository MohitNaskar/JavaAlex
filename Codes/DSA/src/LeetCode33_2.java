public class LeetCode33_2 {
    //case 1 : When you find that mid > mid + 1 element i.e pivot
    //case 2 : If mid element < (mid -1) element
    //case 3 : start element > mid element
    //case 4: start element < mid element
    public static void main(String[] args) {
        System.out.println(search(new int[]{3,1}, 3));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if you do not find the pivot it means the array is not rotated
        if (nums[pivot] == target) {
            return pivot;
        }
        if (pivot == -1) {
            return binarySearch(nums,target,0,nums.length-1);
        }
        // there are 3 cases
        //case 1: pivot element = target
        //case2: target > start element search space (start , pivot -1)
        //case3 : target < pivot  search space (pivot + 1, end)
        if (target >= nums[0]) {
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public static int binarySearch(int[] array, int target,int low, int high) {

        while (low <= high){
            int mid = low + (high - low) / 2;// this is done to escape the out of range in integer problem
            if(target == array[mid]){
                return mid;
            }
            else{
                if(target < array[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases will cover
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid -1;
            }
            if (nums[mid] <= nums[start]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
 }
