public class reverseNumber {
    public static void main(String[] args) {
        reverse(153);
        System.out.println(rev);
    }
     static int rev = 0;
    public static void reverse(int x) {

        if (x == 0)
            return;
        else{
            int rem = x % 10;
            rev = rev * 10 + rem;
            reverse(x / 10);
        }
    }
}
