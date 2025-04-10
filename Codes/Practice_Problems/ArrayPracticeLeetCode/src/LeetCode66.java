import java.util.Arrays;

public class LeetCode66 {
    //https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
;    }
    public static int[] plusOne(int[] digits) {
        //have a +1 only when the last element is 9;
        // +1 to handle the carry
        int i = 0;
        for (i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1 ;
                break;
            }
            else {
                digits[i] = 0;
            }
        }
        if (i == -1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
