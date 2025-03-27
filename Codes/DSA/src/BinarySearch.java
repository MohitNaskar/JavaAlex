public class BinarySearch {
    //binary search for a sorted array

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

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
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {9,8,7,6,5,4,3,2,1};
        System.out.println(binarySearch(array, 9));
    }
}
