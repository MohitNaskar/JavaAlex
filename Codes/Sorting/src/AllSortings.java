import java.util.Arrays;
import java.util.Scanner;

public class AllSortings {
    //to initialize the array
    public static int[] initialise(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println("_____________________________");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //bubble sort
    public static int[] bubbleSort(int[] arr) {//with every pass we put the largest at the end
        boolean swapped = true;
        for (int i = 0; i < arr.length ; i++) { //runs till the last element
            for (int j = 1 ; j < arr.length -i; j++) { //runs till the second last element
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
        printArray(arr);
        return arr;
    }

    //insertio sort
    public static int[] insertionSort(int[] arr) {//to compare the adjacent elements
        for (int i = 0; i < arr.length-1; i++) { //runs till n-2 comparisons
            for (int j = i +1 ; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }
        }
        printArray(arr);
        return arr;
    }

    //selectionSort
    public static int[] selectionSort(int[] arr) { // to select the maximum element and put it in the last
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length -i- 1;// where the element need to be placed
            int max = findMax(arr,lastIndex);
            swap(arr,max,lastIndex);
        }
        printArray(arr);
        return arr;
    }
    public static int findMax(int[] arr,int high) {//returns the index of the max element
        int max = arr[0];
        int index = 0;
        for (int i = 0; i <= high; i++) {
            if (arr[i] > max) {
                index = i;
            }
        }
        return index;
    }

    //merge sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2; //dividing the element in two equal parts
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // to copy and store the left elements
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // to copy and store the right element
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0 ,k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            }
            else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            merged[k] = left[i];
            i++;k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            j++;k++;
        }
        return merged;
    }
    //quickSort
    public static void quickSort(int[] arr,int low,int high) {
        if (low > high) return; // if high < low it returns

        int start = low; // at first the start is initialized to low
        int end = high; // at first the end is initialized to high
        int middle = low + (high - low) / 2; // we choose the pivot as the middle
        int pivot = arr[middle];
        //if the array is already sorted it wont swap
        while (start <= end) { //the loops runs till start is lesser than or equal to end
            while (arr[start] < pivot) { //check if start element is lesser than pivot we keep incrementing the start
                start++;
            }
            while (arr[end] > pivot) {//check if elements at end are greater than pivot if yes we decrement end
                end--;
            }
            if (start <= end) {//if the break out of the while loop we swap the end and start elements
                swap(arr, start, end);
                start++;
                end--;
            }
            //after this the pivot element is placed at the right place then we do the recursive calls for sort the remaining part
        }
        //now the pivot is at the correct index so sort the rest of the halfs now
        quickSort(arr,low,end); //sort the low and end
        quickSort(arr,start,high); // sort the start to high
    }

    //Linear search
    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                System.out.println("_______________________________");
                break;
            }
        }
    }

    //binary search
    public static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                System.out.println("_______________________________");
                break;
            }
            else if( arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = initialise(n);
        printArray(arr);

        while (true){
            System.out.println("Enter 1 to Sort " +
                    "\n2 for Searching"
            + "\n3.Print the array");
            System.out.println("Enter 0 to Exit");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Select the type of sorting");
                System.out.println("1.Bubble Sort" +
                        "\n2.Insertion Sort"
                        + "\n3.Selection Sort"
                        + "\n4.Merge Sort"
                        + "\n5.Quick Sort"
                + "\n6.Exit ");
                int sortType = sc.nextInt();
                switch (sortType){
                    case 1 -> bubbleSort(arr);
                    case 2 -> insertionSort(arr);
                    case 3 -> selectionSort(arr);
                    case 4 -> mergeSort(arr);
                    case 5 -> quickSort(arr,0,arr.length-1);
                    case 6 -> System.exit(0);
                    default -> System.out.println("Invalid sort type");
                }

            }
            else if(choice == 2){
                System.out.println("Enter the target element");
                int target = sc.nextInt();
                System.out.println("Select the type of searching");
                System.out.println("1.Linear Search"
                + "\n2.Binary Search"
                + "\n3.Exit");
                int searchType = sc.nextInt();
                switch (searchType){
                    case 1 -> linearSearch(arr, searchType);
                    case 2 -> binarySearch(arr, target);
                    case 3 -> System.exit(0);
                    default -> System.out.println("Invalid search type");
                }
            }
            else if (choice == 3){
                System.out.println("___________________________________");
                printArray(arr);
            }
            else if(choice == 0){
                break;
            }
        }
    }
}
