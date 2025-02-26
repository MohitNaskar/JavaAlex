package dev.lpa;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = readElements(readInteger());
        System.out.println(Arrays.toString(arr));
        System.out.println(findMin(arr));
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int[] readElements(int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array separated by a comma");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
