public class LeetCode9 {
    //https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0) return false;
        int reverse = 0;
        while(x > 0){
            int local = x % 10;
            reverse = reverse * 10 + local;
            x = x/10;
        }
        if (reverse == temp)    return true;
        return false;
    }
}
