public class LeetCode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(99));
    }
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int result = 0;
        int mid  = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return Math.round(end);
    }
}
