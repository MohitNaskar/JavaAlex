import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the table");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (number * i));
        }
    }
}
