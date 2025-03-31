import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        BubbleSort.initializeArray(arr);
        BubbleSort.printArray(arr);
        insertionSort(arr);
        BubbleSort.printArray(arr);
    }
    static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {//runs till n-2 comparisions
            for (int j = i+1; j > 0; j--) { //j keep checking on it's left
                if (arr[j] < arr[j-1]) {
                    SelectionSort.swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}
