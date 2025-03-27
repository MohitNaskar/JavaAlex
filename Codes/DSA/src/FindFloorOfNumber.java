import java.util.Scanner;

public class FindFloorOfNumber {
    public static int findFloor(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        boolean isAscending = true;
        if (arr[low] > arr[high]){
            isAscending = false;
        }
        while(low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (isAscending){
                if (arr[mid] > target){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if (arr[mid] > target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

        }
        /*
         all the code is same as binary search just the difference is when the high precedes low element(when target is not found)
         the loops breaks according to the condition and we return the high which is the past big number in the array before the target
         */
        return arr[high];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        LinearSearch.Initialize(arr, n);
        LinearSearch.print(arr);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println(findFloor(arr, target));
    }
}
