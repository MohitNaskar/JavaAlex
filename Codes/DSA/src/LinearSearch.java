import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch {
    //linear search for 1d array
    public static int[] Initialize(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of the elements for the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Initialize(arr, n);
        print(arr);
        System.out.println("Enter to element you want to find");
        int target = sc.nextInt();
        if (linearSearch(arr, target) == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position " + linearSearch(arr, target));
        }
    }
}
