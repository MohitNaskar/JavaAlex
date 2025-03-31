import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The largest number is " + a);
        }
        else {
            System.out.println("The largest number is " + b);
        }
    }
}
