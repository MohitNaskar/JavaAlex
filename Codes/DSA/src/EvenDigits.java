import java.util.Scanner;

public class EvenDigits {
    public static int evenDigits(int[] arr) {
        int even = 0;
        int numberOfDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                numberOfDigit++;
                arr[i] /= 10;
            }
            if (numberOfDigit % 2 == 0) {
                even++;
                numberOfDigit = 0;
            }
        }
        return even;
    }
    public static int[] initialiseArray(int[] arr,int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        initialiseArray(arr, size);
        int n = evenDigits(arr);
        System.out.println("Even : "+n);
    }
}
