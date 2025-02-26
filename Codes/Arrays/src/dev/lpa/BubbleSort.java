package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = createArray(size);
        System.out.println(Arrays.toString(arr));
        int[] sorted = bubbleSort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    private static int[] createArray(int size){
        int[] array = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    private static int[] bubbleSort(int[] arr){
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return arr;
    }
}
