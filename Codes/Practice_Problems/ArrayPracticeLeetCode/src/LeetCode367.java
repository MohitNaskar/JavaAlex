public class LeetCode367 {
    //https://leetcode.com/problems/valid-perfect-square/
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num / 2;
        int mid = 0;
        // if (num == 1)   return true;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long square = (long)mid * mid; //long to stop the overflow
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return false;
    }
}
