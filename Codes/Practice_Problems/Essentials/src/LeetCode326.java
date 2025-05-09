public class LeetCode326 {
    public static void main(String[] args) {
        isPowerOfThree(27);
    }
    public static boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;
        if (n== 1)  return true;
        if (n > 1)
            return (n % 3) == 0 && isPowerOfThree(n/3);
        return false;
    }
}
