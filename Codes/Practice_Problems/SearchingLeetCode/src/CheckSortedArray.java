public class CheckSortedArray {
    //recursive version
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(checkSortedArray(arr, 0));
    }
    public static boolean checkSortedArray(int[] arr, int startIndex) {
        int n = startIndex;
        int length = arr.length;
        if (arr == null || arr.length == 0) {
            return true;
        }
        else if(n  == arr.length -1) {
            if (arr[n] < arr[n+1]) {
                checkSortedArray(arr, (n + 1));
            }
        }
        else {
            return true;
        }
        return false;
    }
}
