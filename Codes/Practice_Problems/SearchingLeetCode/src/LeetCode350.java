import java.util.*;

public class LeetCode350 {
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2})));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        nums1 = sort(nums1);
        nums2 = sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int low = 0, high = nums2.length - 1;
        int mid = 0;
        if (m > n) {
            for (int i = 0; i < nums1.length; i++) {
                int target = nums1[i];
                while (low <= high) {
                    mid = low + (high - low) / 2;
                    if (target == nums2[mid]) {
                        intersection.add(target);
                        break;
                    } else if (target < nums2[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                low = 0;
                high = nums2.length - 1;
            }
        }
        else{
            high = nums1.length - 1;
            for (int i = 0; i < nums2.length; i++) {
                int target = nums2[i];
                while (low <= high) {
                    mid = low + (high - low) / 2;
                    if (target == nums1[mid]) {
                        intersection.add(target);
                        break;
                    } else if (target < nums1[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                low = 0;
                high = nums1.length - 1;
            }
        }
        int[] arr = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            arr[i] = intersection.get(i);
        }
        return arr;
    }

    public static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}
