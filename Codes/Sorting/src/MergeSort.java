import java.util.Arrays;

public class MergeSort {
    //merge sort
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr);
    }
    public static int[] mergeSort(int[] arr) {
        if ( arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)); // for all the elements left to mid
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
             if (left[i] < right[j]) {
                 result[k] = left[i];
                 i++;
             }
             else {
                 result[k] = right[j];
                 j++;
             }
             k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            result[k] = right[j];
            k++;
            j++;
        }
        return result;
    }
}
