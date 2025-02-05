public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,32));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99){
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int d3 = num1 / 10;
            int d4 = num2 / 10;
            return d1 == d2 || d1 == d4 || d3 == d2 || d3 == d4;
        }
        return false;
    }
}
