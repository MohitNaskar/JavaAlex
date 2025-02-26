package dev.lpa;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size  = sc.nextInt();
        int[] arr = createArray(size);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = size-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

    }
    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(100);
        }
        return array;
    }
}
