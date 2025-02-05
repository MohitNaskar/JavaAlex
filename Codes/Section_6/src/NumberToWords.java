public class NumberToWords {
    public static void main(String[] args) {
        // System.out.println(getDigitCount(5100));
        numberToWords(9);
    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0)
            return -1;
        else if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }
        return count;
    }
    public static int reverse(int number){
        int num = 0;
        while(number != 0){
            num = num * 10 + number % 10;
            number = number / 10;
        }
        return num;
    }
    public static void numberToWords(int number){
        int num = 0;
        int number1 = reverse(number);
        int leadingZero = getDigitCount(number)- getDigitCount(number1);
        if (number1 < 0){
            System.out.println("Invalid Value");
        } else if (number1 == 0) {
            System.out.println("Zero");
            return;
        } else {
            while (number1 != 0){
                num = number1 % 10;
                number1 = number1 / 10;
                switch (num){
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
            }
            // print zeroes if there are any leading zeroes in reversed number
            for (int i = 0; i < leadingZero; i++) {
                System.out.println("Zero");
            }
        }
    }
}
