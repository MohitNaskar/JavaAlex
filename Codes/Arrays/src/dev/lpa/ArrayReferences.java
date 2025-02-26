package dev.lpa;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {
        //this is an example of reference variable meaning it points directly in the memory
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" After change anotherIntArray = " + Arrays.toString(anotherIntArray));
    }
}
