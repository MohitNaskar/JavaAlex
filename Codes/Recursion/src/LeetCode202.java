public class LeetCode202 {
    //https://leetcode.com/problems/happy-number/
    public static void main(String[] args) {
        System.out.println(isHappy(25));
    }
    public static boolean isHappy(int n) {
        try {
            if (n == 1 || n == 7) {
                return true;
            }
            if (n != 1 && n != 7 && n < 9) {
                return false;
            }

            int sum = 0;
            while (n > 0) {
                int temp = (int) Math.pow(n % 10, 2);
                sum = sum + temp;
                n = n / 10;
            }
            return isHappy(sum);
        }catch (StackOverflowError ex){
            return false;
        }
    }
}
