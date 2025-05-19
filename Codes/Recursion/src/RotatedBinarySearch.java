public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(RotatedRecursiveBinarySearch(arr,7,0,arr.length-1));
    }
    public static int RotatedRecursiveBinarySearch(int[] arr, int target,int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] < arr[mid]) {//to check if the first half of the array is sorted
            if (target < arr[mid]) {
                return RotatedRecursiveBinarySearch(arr, target, start, mid - 1);
            }
            else{
                return RotatedRecursiveBinarySearch(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return RotatedRecursiveBinarySearch(arr, target, mid + 1, end);
        }
        return RotatedRecursiveBinarySearch(arr, target, start, mid - 1);
    }
}
