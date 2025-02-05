import java.sql.SQLOutput;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int number){
        int rev = 0;
        int num = number;
        while(number != 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev == num;
    }
}
