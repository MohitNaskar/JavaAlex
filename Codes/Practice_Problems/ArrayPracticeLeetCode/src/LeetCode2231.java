import java.util.*;

public class LeetCode2231 {
    //https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/?envType=problem-list-v2&envId=sorting
    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }
    public static int largestInteger(int num) {
        List<Integer> digits = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
            if (digit%2 == 0) {
                even.add(digit);
            }
            else {
                odd.add(digit);
            }
        }
        digits = digits.reversed();
        Collections.sort(odd);
        Collections.sort(even);
        odd = odd.reversed();
        even = even.reversed();
        int output = 0;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i)%2 == 0) {
                output = output*10 + even.get(countEven++);
            }
            else {
                output = output*10 + odd.get(countOdd++);
            }
        }
        return output;
    }

}
