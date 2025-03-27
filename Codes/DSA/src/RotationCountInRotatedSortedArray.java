public class RotationCountInRotatedSortedArray {
    // to check the amount of times the array has been rotated
    public static void main(String[] args) {
        System.out.println(countRotations(new int[]{15, 18, 2, 3, 6, 12}));
    }
    public static int countRotations(int[] arr) {
        int count = 0;
        int n = arr.length;
        int pivot  = findPeak(arr);
        count = pivot +1;
        return count;
    }
    public static int findPeak(int[] nums){
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
