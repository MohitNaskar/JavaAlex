import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        BubbleSort.initializeArray(arr);
        BubbleSort.printArray(arr);
        cycleSort(arr);
        BubbleSort.printArray(arr);
    }
    static void cycleSort(int[] arr) {
        int i = 0; // starting index of the array
        while(i < arr.length) { // ending index or till where the i would run
            int corrrect = arr[i] -1; //the correct index would be always i - 1 that is if the element is 3 correct index for that is 2
            if(arr[i] != arr[corrrect]) { // check if arr[i] is at the correct index then swap
                SelectionSort.swap(arr, i, corrrect);
            }
            else {
                i++; // if its at correct index increament i;
            }
        }
    }
}
