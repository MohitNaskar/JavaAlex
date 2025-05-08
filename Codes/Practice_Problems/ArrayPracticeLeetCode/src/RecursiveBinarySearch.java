public class RecursiveBinarySearch {
    public static void main(String[] args) {

    }
    public static int binarySearch(int[] arr, int target,int low,int high) {
        if(low>high) {
            return -1;
        }
        int mid = low + (high-low)/2;
        if(arr[mid]==target) {
            return mid;
        }
        if(arr[mid]>target) {
            return binarySearch(arr, target, low, mid-1);
        }
        return binarySearch(arr, target, mid+1, high);
    }
}
