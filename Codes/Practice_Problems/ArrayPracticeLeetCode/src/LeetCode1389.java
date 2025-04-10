import java.util.Arrays;

public class LeetCode1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = new int[nums.length];
        result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int position = index[i]; //this gives me the position where to insert the element
            for (int j = nums.length - 2; j >= position; j--) { //move the array towards right
                // since the array has got a confined space we start the j count from length - 2
                res[j + 1] = res[j]; // shift the elements toward right
            }
            res[position] = nums[i]; //enter the element to the position
        }
        return res;
    }
}
