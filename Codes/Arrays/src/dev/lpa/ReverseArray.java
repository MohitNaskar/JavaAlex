package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr =  createArray(n);
        System.out.println(Arrays.toString(arr));
        arr = reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] createArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    private static int[] reverseArray(int[] arr) {
        int[] arrRev= new int[arr.length];
        int count = 0;
        for (int i= arr.length-1; i >= 0; i--){
            arrRev[count] = arr[i];
            count++;
        }
        return arrRev;
    }
}
