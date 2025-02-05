public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-121));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if (number >= 0) {
            sum = sum + number % 10;
            while (number >= 10) {
                number = number / 10;
            }
            sum = sum + number % 10;
            return sum;
        }
        return -1;
    }
}
