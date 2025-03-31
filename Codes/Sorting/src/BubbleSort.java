import java.util.Scanner;
//sorts the adjacen element
public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++){// start from 0 to arr.length
            for (int j = 1; j < arr.length - i; j++){ // J runs from 1 to arr.length-i
                if (arr[j] < arr[j-1]){ // compares the current j th element and j - 1 th element
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }

        return arr;
    }
    static int[] initializeArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        initializeArray(arr);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
