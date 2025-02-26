package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray =  new int[10];
        myIntArray[5] = 1;

        double[] myDouble = new double[10];
        myDouble[5] = 1;

        //System.out.println(myIntArray[5]);

        int[] firstTen = {1,2,3,4,5,6,7,8,};
//        int arrayLength = firstTen.length;
//        //System.out.println(arrayLength);
//
//        for (int i = 0; i < arrayLength; i++) {
//            System.out.printf(" "+firstTen[i]);
//        }
        for( int element : firstTen) {
            System.out.println(element+" ");
        }
        System.out.println(Arrays.toString(firstTen));//another way to print an array
        Object objectVariable = firstTen;
        if(objectVariable instanceof int[]) {//checks whether the objectVariable is a subclass of int
            System.out.println("Object Varibale is really an int array");
        }
        Object[] objectArray = new Object[3];//since object is the parent of all java class this array can hold any type of object even an array
        objectArray[0] = 1;
        objectArray[1] = new StringBuilder("Hello");
        objectArray[2] = firstTen;
        for (Object object : objectArray) {
            System.out.println(object);
        }
    }
}
