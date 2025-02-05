public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010,10));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = 0;
        if (first >= 10 && second >= 10) {
            if (first < second){
                for (int i = 1; i <= first; i++) {
                    if (second % i == 0 && first % i == 0) {
                        gcd = i;
                    }
                }
                return gcd;
            }
            else if (second < first){
                for (int i = 1; i <= second; i++) {
                    if (second % i == 0 && first % i == 0) {
                        gcd = i;
                    }
                }
                return gcd;
            }
        }
        return -1;
    }
}
