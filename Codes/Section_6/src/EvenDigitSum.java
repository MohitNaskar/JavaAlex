public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-252));
    }
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number >= 0) {
            while (number > 0) {
                if (number % 2 == 0) {
                    sum = sum + number % 10;
                    number = number / 10;
                } else {
                    number = number / 10;
                }
            }
            return sum;
        }
        return -1;
    }
}
