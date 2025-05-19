public class RecurrsiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,9,7,5,1};
        int target = 5;
        System.out.println(optimalRecurrsiveBinarySearch(arr,target,0,arr.length-1));
    }
    static int RecurrsiveBinarySearch(int[] arr, int target,int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low+ (high-low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return RecurrsiveBinarySearch(arr, target, mid+1, high);
        }
        return RecurrsiveBinarySearch(arr, target, low, mid-1);
    }
    static int optimalRecurrsiveBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low+ (high-low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        boolean isAscending = false;
        if (arr[low] < arr[high]){
            isAscending = true;
        }
        if (isAscending){
            if (target > mid){
                return optimalRecurrsiveBinarySearch(arr, target, mid+1, high);
            }
            return optimalRecurrsiveBinarySearch(arr, target, low, mid-1);
        }
        else {
            if (target > arr[mid]){
                return optimalRecurrsiveBinarySearch(arr, target, low, mid -1);
            }
            return optimalRecurrsiveBinarySearch(arr, target, mid + 1, high);
        }
    }
}
