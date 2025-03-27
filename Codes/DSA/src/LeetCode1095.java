public class LeetCode1095 {

    public static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int left = orderAgnosticBinarySearch(arr,target,0,peak);
        if(left == -1){
            return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
        }
        return left;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target,int low,int peak) {
        boolean isAscending = true;
        if (arr[low] > arr[peak]) {
            isAscending = false;
        }
        while (low <= peak){
            int mid = low + (peak - low) / 2;// this is done to escape the out of range in integer problem
            if(target == arr[mid]){
                return mid;
            } else if (isAscending) {
                if(target < arr[mid]){
                    peak = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if ((target > arr[mid])){
                    peak = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
        
    }
    //Find in mountain array
    public static int findPeak(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while (low < high){
            mid = low + (high - low) / 2;// this is done to escape the out of range in integer problem

            if (array[mid] > array[mid + 1]){// this will check the decending side of the array if this "if" fails low will be equal to mid + 1 and continue check in the
                //decending side of the array else it will check in the left side if this "if" condition is true where high is equal to mid because it also can be a
                // possible ans
                //this algorithmn is based on the binary search we devide the array in two equal parts
                //and then apply binary search for each side of the array since its given sorted left side
                //left side is ascending and right side is descending
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        //returning low since the end and start will be equal in the peak element
        return low;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{0,5,3,1}, 1 ));
    }
}
