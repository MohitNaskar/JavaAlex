public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else if (number == 2) {
            return 2;
        }
        else {
            int count = 0;
            for (int i = number; i >= 1; i--) {
                if (number % i == 0) {
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count > 2) {
                        count = 0;
                        continue;
                    }
                    else
                        return i;
                }
            }
        }
        return -1;
    }
}
