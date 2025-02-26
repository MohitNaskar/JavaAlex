package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = createArray(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
        int mid = arr.length / 2;
        int element;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        element = sc.nextInt();
        int result = binarySearch(arr,element,0,arr.length);
        System.out.println(result);

    }
    private static int[] createArray(int len) {
        int[] arr = new int[len];
        Random rand  = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
    private static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
