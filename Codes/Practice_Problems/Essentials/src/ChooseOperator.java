import java.util.Scanner;

public class ChooseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        char operator = input.next().charAt(0);
        switch (operator){
            case '+' -> System.out.println("+" + a + b);
            case '-' -> System.out.println("-" + a + b);
            case '*' -> System.out.println("*" + a + b);
            case '/' -> System.out.println("/" + a + b);
        }
    }
}
