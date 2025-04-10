import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {
    //https://leetcode.com/problems/add-to-array-form-of-integer/
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        System.out.println(addToArrayForm(arr, 1));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<Integer>();
        int i = num.length - 1;
        int carry = 0;
        while (i >= 0 ||  k >0) {
            int sum = carry;
            if (i >= 0) {
                sum += num[i--];
            }
            if (k > 0){
                sum += k % 10;
                k /= 10;
            }
            result.add(sum%10); // to handle the carry
            carry = sum/10;

        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }
}