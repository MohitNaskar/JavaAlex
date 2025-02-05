public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int n) {
        int sum = 0;
        if (n < 0){
            return -1;
        }
        else {
            while (n > 0){
                sum += n % 10;
                n /= 10;
            }
        }
        return sum;
    }
}
