import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int high) {
        if(high == 0){
            return;
        }
        else{
            int max= returnMax(arr,0,high);
            int temp= arr[max];
            arr[max]= arr[high];
            arr[high]= temp;
            sort(arr,high-1);
        }
    }
    public static int returnMax(int[] arr, int start, int end) {
        int max = arr[start];
        int index = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
