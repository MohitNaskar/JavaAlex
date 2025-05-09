public class UsingRecursionCheckSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,2,3,4,5},0));
    }
    public static boolean isSorted(int[] arr , int start) {
        if (start == arr.length - 1) {
            return true;
        }
        if (arr.length <= 1)    return true;
        if (arr[start] > arr[start+1]) return false;
        return isSorted(arr,start+1);
    }
}
