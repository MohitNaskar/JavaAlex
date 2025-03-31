import java.util.Scanner;

public class InfiniteInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Enter an integer: ");
            char input = sc.next().charAt(0);
            if (input == 'x') {
                break;
            }
            else{
                result += Integer.parseInt(String.valueOf(input));//extracts integer from a char
            }
        }
        System.out.println(result);
    }
}
