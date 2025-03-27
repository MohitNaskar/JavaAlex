import java.util.Scanner;
//consider sorted array for this problem at this point
//ceiling of a number means smallest number greater or equal to target
public class FindCeilingOfNumber {
    public static int findCeiling(int[] arr, int target){
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
         all the code is same as binary search just the difference is when the low exceeds the high element(when target is not found)
         the loops breaks according to the condition and we return the low which is the next big number in the array after the target
         */
        return arr[low];
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
        System.out.println(findCeiling(arr, target));
    }
}
