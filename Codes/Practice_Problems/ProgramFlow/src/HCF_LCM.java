import java.sql.SQLOutput;
import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        System.out.println(lcm(sc.nextInt(), sc.nextInt()));
    }
    static int lcm(int a, int b) {
        int gcd = hcf(a, b);
        return (a / gcd) * b; // Prevents overflow
    }
    static int hcf(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) { // Start from the smaller number
            if (a % i == 0 && b % i == 0) {
                return i; // Return the HCF
            }
        }
        return 1; // HCF is at least 1
    }
}
