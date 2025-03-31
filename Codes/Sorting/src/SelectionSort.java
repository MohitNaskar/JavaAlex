import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        BubbleSort.initializeArray(arr);
        BubbleSort.printArray(arr);
    }
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //find the max element in the remaining array and swap with the correct index
            int last = array.length -i -1;// finds where the maximum element needs to be placed
            int max = getMaxIndex(array,0,last); // finds the max index
            swap(array,max,last); //swaps
        }
        return array;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int getMaxIndex(int[] array,int start,int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
}
