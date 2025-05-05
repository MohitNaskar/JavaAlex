import java.util.Arrays;

public class LeetCode1802 {
    //https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
    public static void main(String[] args) {
        maxValue(4,2,6);
    }
    public static int maxValue(int n, int index, int maxSum) {
        int maxIndexValue = 1;
        maxSum -= n;
        int maxLeft = index;
        int maxRight = n-index-1;
        int left = 0, right = 0;
        while(maxSum > 0){
            maxIndexValue++;
            int leftVal = Math.min(left++,maxLeft);
            int rightVal = Math.min(right++,maxRight);

            maxSum -= (1 + leftVal + rightVal); //1 is for maxIndex++

            if (leftVal == maxLeft && rightVal == maxRight){
                break;
            }

            if (maxSum > 0){
                maxIndexValue = maxIndexValue + (maxSum/n);
            }
        }

        return (maxSum < 0) ? maxIndexValue -1: maxIndexValue;
    }
}
