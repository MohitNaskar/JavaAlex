import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and column numbers");
        int row = in.nextInt();
        int col = in.nextInt();
        int [][] array = new int [row][col];
        initialiseArray(array, row, col);
        printArray(array);
        System.out.println("Enter the element to be searched");
        int search = in.nextInt();
        binarySearch1(array, search);
    }
    static int[][] initialiseArray(int[][] arr, int row, int col) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // we do arr[i].length because we want the length of the column related to that row
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //linear search in 2d
    static int linearSearch(int[][] arr ,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
    //matrix is row wise and column wise sorted
    static int[] binarySearch1(int[][] arr, int target) {
        // how binary search works for 2d arrays
        // we start with the 1st row and last column (sorted matrix ) and keep eliminating the rows and columns
        // there will be 3 cases for it
        // case 1: if the element == target return
        // case 2: if that element is larger than target
        // case 3: if the element is smaller than target
        // in both the cases we eliminate the row and column
        int row = 0;
        int col = arr.length - 1;
        while (row <= col) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    //simple binary search. search in the row provided and columns provided
    static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd) {// Since it's a 2d matrix we take the row
        // the row in which we will search and the column starting and ending
        while (cStart <= cEnd) {
            int mid = (cStart + cEnd) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }


    //we have a sorted 2d array
    static int[] binarySearch2(int[][] arr, int target) {
        // case 1: element = target return element

        // case 2: element > target ignore rows after it
        // case 3: element < target ignore rows before it
        int row = 0;
        int col = arr[0].length - 1;
        if (row  == 1){
            return binarySearch(arr,target,0,0,col);
        }

        int rowStart = 0;
        int rowEnd = row - 1;
        int cMid = col/2;

        // to reduce it to 2 rows
        while (rowStart <= rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart)/2;
            if (arr[rowMid][cMid] == target) {
                return new int[]{rowMid, col};
            }
            if (arr[rowMid][cMid] < target) {
                rowStart = rowMid ;
            }
            else {
                rowEnd = rowMid;
            }
        }

        //now we have 2 rows
        //check if the target element is in the column if last 2 rows
        if (arr[rowStart][cMid] == target) {
            return new int[]{rowStart, col};
        }
        if (arr[rowStart + 1][cMid] == target) {
            return new int[]{rowStart + 1, col}; //+1 because it has only got 2 rows until now
        }

        //search in 1st half
        if (target <= arr[rowStart][cMid -1]) {
            return binarySearch(arr,target,rowStart,0,cMid-1);
        }
        //search in 2nd half
        if (target >= arr[rowStart][cMid + 1] && target <= arr[rowStart][cMid -1]) {
            return binarySearch(arr,target,rowStart,cMid + 1,col-1);
        }
        //search in 3rd half
        if (target >= arr[rowStart + 1][cMid - 1]) {
            return binarySearch(arr,target,rowStart+1,0,cMid-1);
        }
        else{
            return binarySearch(arr,target,rowStart + 1,cMid + 1,col-1);
        }
    }

}
