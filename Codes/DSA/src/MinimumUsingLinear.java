import java.util.Scanner;

public class MinimumUsingLinear {
    public static int[] Initialisation(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int findMinimum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++ ) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = Initialisation(arr, n);
        printArray(arr);
        int min = findMinimum(arr);
        System.out.println("Minimum is: " + min);
    }
}
