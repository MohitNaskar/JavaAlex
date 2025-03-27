public class OrderAgnosticBinarySearch {
    //this is the optimised solution for a binary search works for both ascending and descending order
    public static int AgnosticBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        boolean isAscending = true;
        if (array[low] > array[high]) {
            isAscending = false;
        }
        while (low <= high){
            int mid = low + (high - low) / 2;// this is done to escape the out of range in integer problem
            if(target == array[mid]){
                return mid;
            } else if (isAscending) {
                if(target < array[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if ((target > array[mid])){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {9,8,7,6,5,4,3,2,1};
        System.out.println(AgnosticBinarySearch(array2, 9));
        System.out.println(AgnosticBinarySearch(array, 8));
    }
}
