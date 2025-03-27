public class SearchInInfiniteArray {
    //Search for an element in arr infinite sorted array.
    /*
    Approach take the infinite array in chunks and then apply binary search for each search
    start from 2 elements and keep increasing the chunk size until we find the element
    */
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            //double the box value
            // end = end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }

    public static int binarySearch(int[] array, int target,int low,int high) {

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
}
