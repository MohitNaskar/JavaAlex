public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(142));

    }
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
