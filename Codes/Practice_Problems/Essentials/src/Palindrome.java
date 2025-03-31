import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println(checkPalindrome(num));
    }
    static boolean checkPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        while(temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}
