import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1539 {
    //https://leetcode.com/problems/kth-missing-positive-number/
    public static void main(String[] args) {
        findKthPositive(new int[]{2,3,4,7,11},5);
    }
    public static int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid+1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }
}
