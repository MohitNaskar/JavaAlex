import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimensionalArray {

    //Function to initialize array
    public static int[][] initializeArr(int[][] arr, int row, int col) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //method to linear search in a 2d array
    public static void linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    System.out.println("Element found at index " + i+","+j);
                }
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row,col;
        System.out.println("Enter the number of rows and columns: ");
        row = scanner.nextInt();
        col = scanner.nextInt();
        int[][] arr = new int[row][col]; //column is not important to be initalised
        initializeArr(arr, row, col);
        printArr(arr);
        System.out.println("Enter the element to be searched: ");
        int target = scanner.nextInt();
        linearSearch(arr, target);
    }
}
